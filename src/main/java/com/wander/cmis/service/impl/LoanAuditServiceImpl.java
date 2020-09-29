package com.wander.cmis.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.ErrorLog;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.mapper.ErrorLogMapper;
import com.wander.cmis.mapper.ExchangePolguaappMapper;
import com.wander.cmis.service.LoanAuditService;
import com.wonders.cqjy.ggfw.api.XwdbApi;
import com.wonders.cqjy.ggfw.dto.XwdbReviewDTO;
import com.wondersgroup.commons.json.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * 贷款审核
 */
@Service
@Transactional
public class LoanAuditServiceImpl implements LoanAuditService {

    private static final Logger logger = LoggerFactory.getLogger(LoanAuditService.class);

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Reference
    private XwdbApi xwdbApi;

    @Resource
    private ErrorLogMapper errorLogMapper;

    @Override
    public void doAudit() {
        try {
            //获取未同步的数据
            List<ExchangePolguaapp> list = exchangePolguaappMapper.selectAuditStatus();
            logger.info("开始同步贷款审核数据---->" + list);
            List<String> updateSyncList = new ArrayList();
            if (list != null && list.size() > 0) {
                for (int i = 0, len = list.size(); i < len; i++) {
                    ExchangePolguaapp x = list.get(i);
                    XwdbReviewDTO xwdbReviewDTO = new XwdbReviewDTO();
                    if ("".equals(x.getApplyno()) || x.getApplyno() == null) {
                        continue;
                    }
                    //贷款编号
                    xwdbReviewDTO.setTac001(Long.parseLong(x.getApplyno()));
                    //审核日期
                    xwdbReviewDTO.setTac093(Integer.parseInt(
                            Optional.ofNullable(x.getXwdauditdate()).orElse("19700101")
                    ));
                    //审核状态
                    Map<String, String> sheheMap = new HashMap<>();
                    initSheHeStatusMap(sheheMap);
                    xwdbReviewDTO.setTac095(sheheMap.get(x.getXwdauditresult()));
                    //审核意见
                    xwdbReviewDTO.setTac096(Optional.ofNullable(x.getXwdauditadvice()).orElse(""));

                    //调用就业局接口
                    JsonResult jsonResult = xwdbApi.saveXwdbReview(xwdbReviewDTO);
                    logger.info("推送贷款审核编号："+x.getApplyno());
                    logger.info("返回信息："+JSONObject.toJSON(jsonResult).toString());
                    //推送返回成功 修改审核状态为已审核 推送是否推送就业局为已推送
                    /*String s = dojyApi(xwdbReviewDTO);
                    JSONObject jsonObject = JSONObject.parseObject(s);
                    if ("200".equals(jsonObject.getString("statusCode"))) {
                        updateSyncList.add(x.getId());
                    }*/
                    if (200 == jsonResult.getStatusCode()) {
                        updateSyncList.add(x.getId());
                    } else {
                        /**
                         * 添加错误日志到日志表
                         */
                        ErrorLog errorLog = new ErrorLog();
                        errorLog.setId(UUID.randomUUID().toString().replace("-", ""));
                        errorLog.setJyjInterface("2.4.9.5 贷款审核接口（担保审核调用）");
                        String send = JSONObject.toJSON(xwdbReviewDTO).toString();
                        errorLog.setSendData(send);
                        String s = JSONObject.toJSON(jsonResult).toString();
                        errorLog.setResultData(s);
                        errorLogMapper.insert(errorLog);
                    }
                }
            }
            logger.info("更新中间表状态：" + Arrays.toString(updateSyncList.toArray()));
            if (updateSyncList != null && updateSyncList.size() > 0) {
                for (int i = 0, len = updateSyncList.size(); i < len; i++) {
                    String id = updateSyncList.get(i);
                    exchangePolguaappMapper.updateSync(id);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void initSheHeStatusMap(Map<String, String> sheheMap) {
        //审核通过6001,审核不通过6002,退回修改6003
        //小微担审核结果 通过0，终止1,退回修改2
        sheheMap.put("0", "6001");
        sheheMap.put("1", "6002");
        sheheMap.put("2", "6003");
    }

    /**
     * 贷款审核接口（就业局审核调用） 2.4.9.5
     *
     * @param xwdbReviewDTO
     * @return
     */
    private String dojyApi(XwdbReviewDTO xwdbReviewDTO) {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "xwdbApi";
        String param2 = "saveXwdbReview";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = xwdbReviewDTO;
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }
}
