package com.wander.cmis.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.ErrorLog;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.entity.ExchangeProjectLoan;
import com.wander.cmis.mapper.ErrorLogMapper;
import com.wander.cmis.mapper.ExchangePolguaappMapper;
import com.wander.cmis.mapper.ExchangeProjectLoanMapper;
import com.wander.cmis.service.LoanApplicationService;
import com.wonders.cqjy.ggfw.api.XwdbApi;
import com.wonders.cqjy.ggfw.dto.XwdbReviewDTO;
import com.wondersgroup.commons.json.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

/**
 * 推送放款信息-贷款发放
 * 在中间表中获取需要推送的放款信息记录
 * 填充就业局提供接口对象中 放款相关字段
 */
@Service
@SuppressWarnings("all")
@Transactional
public class LoanApplicationServiceImpl implements LoanApplicationService {

    private static final Logger logger = LoggerFactory.getLogger(LoanApplicationService.class);

    @Resource
    private ExchangeProjectLoanMapper exchangeProjectLoanMapper;
    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Reference(check=true,url = "dubbo://172.17.97.254:8088")
    private XwdbApi xwdbApi;

    @Resource
    private ErrorLogMapper errorLogMapper;

    @Override
    public void convert() {
        try {
            List<ExchangeProjectLoan> exhangeProjectLoans = exchangeProjectLoanMapper.selectByUnRead();
            logger.info("开始推送放款信息---->" + exhangeProjectLoans);
            List<String> updateSyncList = new ArrayList();
            if (exhangeProjectLoans != null && exhangeProjectLoans.size() > 0) {
                for (int j = 0, len = exhangeProjectLoans.size(); j < len; j++) {
                    ExchangeProjectLoan i = exhangeProjectLoans.get(j);
                    if (i.getJyid() == null || "".equals(i.getJyid())) {
                        continue;
                    }
                    if (i.getLoandate() == null || "".equals(i.getLoandate())) {
                        continue;
                    }
                    if (i.getLoandate().length() < 8) {
                        continue;
                    }
                    XwdbReviewDTO xwdbReviewDTO = new XwdbReviewDTO();

                    //贷款编号 取的中间表(放款信息)的id
//                    ExchangePolguaapp polguaapp = exchangePolguaappMapper.selectByPrimaryKey(i.getLoanapplyid());
                    xwdbReviewDTO.setTac001(Long.parseLong(i.getJyid()));
                    //贷款发放类型
                    xwdbReviewDTO.setTac030a("1");
                    //发放日期
                    xwdbReviewDTO.setTac074(Integer.parseInt(i.getLoandate()));
                    //发放状态
                    xwdbReviewDTO.setTac083("4001");
                    //发放金额
                    xwdbReviewDTO.setTac097(i.getLoanamount());
                    //贷款利率
                    xwdbReviewDTO.setTac014(
                            Optional.ofNullable(i.getLoanrate()).orElse(BigDecimal.valueOf(0)).doubleValue()
                    );

                    /**
                     * 调用就业局的接口
                     */
                    /*String jsonResult = saveXwdbFinanced(xwdbReviewDTO);
                    JSONObject jsonObject = JSONObject.parseObject(jsonResult);
                    String statusCode = jsonObject.getString("statusCode");
                    if ("200".equals(statusCode)) {
                        updateSyncList.add(i.getId());
                    } else {
                        *//**
                         * 添加错误日志到日志表
                         *//*
                        ErrorLog errorLog = new ErrorLog();
                        errorLog.setId(UUID.randomUUID().toString().replace("-", ""));
                        errorLog.setJyjInterface("2.4.9.6 贷款发放接口");
                        String send = JSONObject.toJSON(xwdbReviewDTO).toString();
                        errorLog.setSendData(send);
                        String s = JSONObject.toJSON(jsonResult).toString();
                        errorLog.setResultData(s);
                        errorLogMapper.insert(errorLog);
                    }*/
                    //TODO 上线之后使用这个
                    JsonResult jsonResult = xwdbApi.saveXwdbFinanced(xwdbReviewDTO);
                    logger.info("推送放款信息请求参数："+JSONObject.toJSON(xwdbReviewDTO).toString());
                    logger.info("返回信息："+JSONObject.toJSON(jsonResult).toString());
                    //推送返回成功 修改审核状态为已审核 推送是否推送就业局为已推送
                    if (200 == jsonResult.getStatusCode()) {
                        updateSyncList.add(i.getId());
                    }else {
                       /**
                         * 添加错误日志到日志表
                        */
                        ErrorLog errorLog = new ErrorLog();
                        errorLog.setId(UUID.randomUUID().toString().replace("-", ""));
                        errorLog.setJyjInterface("2.4.9.6 贷款发放接口");
                        String send = JSONObject.toJSON(xwdbReviewDTO).toString();
                        errorLog.setSendData(send);
                        String s = JSONObject.toJSON(jsonResult).toString();
                        errorLog.setResultData(s);
                        errorLogMapper.insert(errorLog);
                    }
                }
            }
            logger.info("更新贷款表状态：" + Arrays.toString(updateSyncList.toArray()));
            //成功之后更新数据库
            if (updateSyncList != null && updateSyncList.size() > 0) {
                for (int i = 0, len = updateSyncList.size(); i < len; i++) {
                    String id = updateSyncList.get(i);
                    exchangeProjectLoanMapper.updateSync(id);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String saveXwdbFinanced(XwdbReviewDTO xwdbReviewDTO) {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "xwdbApi";
        String param2 = "saveXwdbFinanced";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = xwdbReviewDTO;
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }

    /**
     * 调用就业局 贷款审核接口（担保审核调用） 2.4.9.6
     *
     * @param xwdbReviewDTO
     * @return
     */
    private String dojyApi(XwdbReviewDTO xwdbReviewDTO) {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "xwdbApi";
        String param2 = "saveXwdbFinanced";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = xwdbReviewDTO;
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }

}
