package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.CommApiDTO;
import com.wander.cmis.bean.UnitBaseInfoApiDTO;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.ErrorLog;
import com.wander.cmis.entity.ExchangeCounty;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.mapper.ErrorLogMapper;
import com.wander.cmis.mapper.ExchangeCountyMapper;
import com.wander.cmis.mapper.ExchangePolguaappMapper;
import com.wander.cmis.service.UnitSyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UnitSyncServiceImpl implements UnitSyncService {

    Logger logger = LoggerFactory.getLogger(UnitSyncServiceImpl.class);

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Resource
    private ExchangeCountyMapper exchangeCountyMapper;

    @Resource
    private ErrorLogMapper errorLogMapper;

    @Override
    public void doUnitSync() {
        List<ExchangePolguaapp> exchangePolguaapps = exchangePolguaappMapper.test();
        exchangePolguaapps.stream().forEach(exchangePolguaapp -> {
            /**
             * 单位绑定推送接口
             * 1.直接推送查询出来的单位
             * 2.修改数据库的标识位UNIT_SYNC_STATUS 1.已推送
             */
            UnitBaseInfoApiDTO unitBaseInfoApiDTO = new UnitBaseInfoApiDTO();
            //commApiDTO业务经办信息
            CommApiDTO commApiDTO = new CommApiDTO();
            //支撑平台办件编号
            commApiDTO.setHandlingno(UUID.randomUUID().toString().replace("-", ""));
            //渠道数据来源
            commApiDTO.setCaa999("50");
            //办件信息数据传输类
//        CommApiDTO commApiDTO = new CommApiDTO();
            //办件信息-支撑平台办件编号 handlingno N
//        commApiDTO.setHandlingno(exchangePolguaapp.getHandingno());
            //办件信息-档案编号  recordid
            //办件信息-案卷类别  abd101 有附件时必传
            //办件信息-条形码   abd130
            //办件信息-业务部门  abd014
            //办件信息-行政区划  abd120 有附件时必传
            //办件信息-经办人   aae011
            //办件信息-数据来源  abd513 有附件时必传
            //办件信息-viewtype
            //渠道数据来源  caa999   N  码值AHD500  caa999 分配给你们的是 50
//        commApiDTO.setCaa999("50");
            //办件信息-办件明细信息   bjxxPApiDTOs 用于存放一次办件中多人员明细档案等信息

            //办件明细信息-身份证号  aac002  N
            //办件明细信息-档案编号  recordid
            //办件明细信息-案卷编号  abd101  N
            //abd130    办件明细信息-条形码
            //办件明细信息-业务部门  abd014
            //办件明细信息-行政区划  abd120  N   有附件时必传
            //办件明细信息-数据来源  abd513  N   有附件时必传
            //办件明细信息-viewtype

            unitBaseInfoApiDTO.setCommApiDTO(commApiDTO);
            //统一社会信用代码 aab003 N
            unitBaseInfoApiDTO.setAab003(exchangePolguaapp.getLicensenum());
            //单位名称--->企业名称 aab004  N
            unitBaseInfoApiDTO.setAab004(exchangePolguaapp.getClientname());
            // 单位类型  aab019    码值AAB019
            unitBaseInfoApiDTO.setAab019("13");
            //TODO 行业分类 ---> 所属行业 aab022  N   码值AAB022@1
            unitBaseInfoApiDTO.setAab022("080000");
            // 经济类型  aab020    码值AAB020
//        unitBaseInfoApiDTO.setAab020();
            //法人姓名  aab013  N
            unitBaseInfoApiDTO.setAab013(exchangePolguaapp.getLegalnm());
            //法人证件号 aab014  N
            unitBaseInfoApiDTO.setAab014(exchangePolguaapp.getLegalcredentialno());
            //联系人姓名 cce014
//        unitBaseInfoApiDTO.setCce014();
            //联系电话  cce015  N
            unitBaseInfoApiDTO.setCce015(exchangePolguaapp.getContactway());
            //单位所在区域    aab078  N
            ExchangeCounty exchangeCounty = exchangeCountyMapper.selectByPrimaryKey(exchangePolguaapp.getDomicile());
            if (StringUtils.isEmpty(exchangeCounty)) {
                logger.info("id对应的就业局区域码值为空--->id=" + exchangePolguaapp.getDomicile());
            } else {
                unitBaseInfoApiDTO.setAab078(exchangeCounty.getJyjcountyid());
            }
            String result = unitBandingSaveDo(unitBaseInfoApiDTO);
            JSONObject parse = (JSONObject) JSONObject.parse(result);
            //添加错误日志
            if (!"200".equals(parse.getString("statusCode"))) {
                ErrorLog errorLog = new ErrorLog();
                errorLog.setId(UUID.randomUUID().toString().replace("-", ""));
                errorLog.setJyjInterface("2.4.3.4 绑定提交执行接口");
                errorLog.setSendData(JSONObject.toJSON(unitBaseInfoApiDTO).toString());
                errorLog.setResultData(result);
                errorLogMapper.insert(errorLog);
            } else {
                exchangePolguaappMapper.updateUnitSyncStatus(exchangePolguaapp.getId());
            }
        });
    }

    /**
     * 调用单位信息绑定接口
     *
     * @param unitBaseInfoApiDTO
     * @return
     */
    private String unitBandingSaveDo(UnitBaseInfoApiDTO unitBaseInfoApiDTO) {
        SerializeConfig serconfig = new SerializeConfig();
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));
        String param1 = "unitBaseApi";
        String param2 = "unitBandingSave";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = unitBaseInfoApiDTO;
        String jsonstr = JSON.toJSONString(params, serconfig);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }
}
