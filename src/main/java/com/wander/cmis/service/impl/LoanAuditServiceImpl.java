package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.XwdbReviewDTO;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.mapper.ExchangePolguaappMapper;
import com.wander.cmis.service.LoanAuditService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * 贷款审核
 */
@Service
public class LoanAuditServiceImpl implements LoanAuditService {

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Override
    public void doAudit() {
        //获取未同步的数据
        List<ExchangePolguaapp> list = exchangePolguaappMapper.selectAuditStatus();
        list.stream().forEach(x -> {
            XwdbReviewDTO xwdbReviewDTO = new XwdbReviewDTO();

            //贷款编号
            xwdbReviewDTO.setTac001(Long.parseLong(x.getApplyno()));
            //审核日期
            xwdbReviewDTO.setTac093(Integer.parseInt(
                    Optional.ofNullable(x.getAuditdate()).orElse("19700101")
            ));
            //审核状态
            xwdbReviewDTO.setTac095(Optional.ofNullable(x.getAuditresult()).orElse(""));
            //审核意见
            xwdbReviewDTO.setTac096(Optional.ofNullable(x.getAuditadvice()).orElse(""));

            //调用就业局接口
            dojyApi(xwdbReviewDTO);
        });
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
