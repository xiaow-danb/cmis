package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.PersonBaseInfoApiDTO;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.ErrorLog;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.mapper.ErrorLogMapper;
import com.wander.cmis.mapper.ExchangePolguaappMapper;
import com.wander.cmis.service.PersonSyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

@Service
@Transactional
public class PersonSyncServiceImpl implements PersonSyncService {

    Logger logger = LoggerFactory.getLogger(PersonSyncServiceImpl.class);

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Resource
    private ErrorLogMapper errorLogMapper;

    @Override
    public void doPersonSync() {
        Map<String, String> initMap = new HashMap<>();
        init(initMap);
        List<ExchangePolguaapp> exchangePolguaapps = exchangePolguaappMapper.personalText();
        exchangePolguaapps.stream().forEach(exchangePolguaapp -> {
            PersonBaseInfoApiDTO personBaseInfoApiDTO = new PersonBaseInfoApiDTO();
            //国籍或地区 固定传中国
            personBaseInfoApiDTO.setAac161("001");
            //证件类型  aac058
            personBaseInfoApiDTO.setAac058("1");
            //证件号码  aac002
            personBaseInfoApiDTO.setAac002(exchangePolguaapp.getCredentialno());
            //姓名    aac003
            personBaseInfoApiDTO.setAac003(exchangePolguaapp.getClientname());
            //性别    aac004
            personBaseInfoApiDTO.setAac004(exchangePolguaapp.getGender());
            //出生日期  aac006
            String credentialno = exchangePolguaapp.getCredentialno();
            String substring = credentialno.substring(6, 14);
            personBaseInfoApiDTO.setAac006(new BigDecimal(substring));
            //手机号   aac067
            personBaseInfoApiDTO.setAac067(exchangePolguaapp.getContactway());
            //渠道来源  小贷公司固定传"50"
            personBaseInfoApiDTO.setCaa999("50");
            //TODO 假值 户籍区域编码
            personBaseInfoApiDTO.setAaf016("500106");
            //TODO 假值 常住地区编码
            personBaseInfoApiDTO.setCaa027("500106");
            //人员类别1 cca014  码值CCA014@8
            personBaseInfoApiDTO.setCca014(initMap.get(exchangePolguaapp.getProposerbigtype()));
            String s = doRegistPersonInfo(personBaseInfoApiDTO);
            JSONObject jsonObject = JSONObject.parseObject(s);
            String statusCode = jsonObject.getString("statusCode");
            if (!"200".equals(statusCode)) {
                logger.info("就业局系统绑定人员信息失败!!!!");
                //推送成功之后更新推送状态
                exchangePolguaappMapper.updatePersonSyncStatus(exchangePolguaapp.getId());
            } else {
                ErrorLog errorLog = new ErrorLog();
                errorLog.setId(UUID.randomUUID().toString().replace("-", ""));
                errorLog.setJyjInterface("2.4.2.1 人员基本信息新增或更新接口");
                String send = JSONObject.toJSON(personBaseInfoApiDTO).toString();
                errorLog.setSendData(send);
                errorLog.setResultData(s);
                errorLogMapper.insert(errorLog);
            }
        });
    }

    /**
     * 初始化人员类别映射关系
     *
     * @param initMap
     */
    private void init(Map<String, String> initMap) {
        //复员转业军人
        initMap.put("2", "60");
        //刑满释放
        initMap.put("3", "25");
        //高校毕业生
        initMap.put("4", "70");
        //化解过剩产能企业员工
        initMap.put("5", "98");
        //农村自主创业人员
        initMap.put("6", "40");
        //网络商户
        initMap.put("7", "91");
        //建档立卡贫困人员
        initMap.put("8", "99");
        //城镇登记失业人员
        initMap.put("10", "30");
        //城乡低保人员
        initMap.put("11", "30");
        //城镇零就业家庭成员
        initMap.put("12", "30");
        //残疾人
        initMap.put("13", "80");
    }

    /**
     * 2.4.2.1 人员基本信息新增或更新接口
     *
     * @param personBaseInfoApiDTO
     * @return
     */
    private String doRegistPersonInfo(PersonBaseInfoApiDTO personBaseInfoApiDTO) {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "personBaseApi";
        String param2 = "personBaseInfoSaveOrUpdate";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = personBaseInfoApiDTO;
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }
}
