package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.XwdbReviewDTO;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.ExchangeProjectLoan;
import com.wander.cmis.mapper.ExchangeProjectLoanMapper;
import com.wander.cmis.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 推送放款信息-贷款发放
 * 在中间表中获取需要推送的放款信息记录
 * 填充就业局提供接口对象中 放款相关字段
 */
@Service
@SuppressWarnings("all")
public class LoanApplicationServiceImpl implements LoanApplicationService {

    @Resource
    private ExchangeProjectLoanMapper exchangeProjectLoanMapper;

    @Override
    public void convert() {
        List<ExchangeProjectLoan> exhangeProjectLoans = exchangeProjectLoanMapper.selectByUnRead();
        List<String> updateSyncList = new ArrayList();
        exhangeProjectLoans.stream().forEach(i ->{
            XwdbReviewDTO xwdbReviewDTO = new XwdbReviewDTO();

            //贷款编号 取的中间表(放款信息)的id
            xwdbReviewDTO.setTac001(Long.parseLong(i.getId()));
            //贷款发放类型
            xwdbReviewDTO.setTac030a(i.getLoanType());
            //发放日期
            xwdbReviewDTO.setTac074(i.getLoandate());
            //发放状态
            xwdbReviewDTO.setTac083(i.getGrantStatus());
            //发放金额
            xwdbReviewDTO.setTac097(i.getLoanamount());
            //贷款利率
            xwdbReviewDTO.setTac014(i.getLoanrate());

            /**
             * 调用就业局的接口
             */
            String s = dojyApi(xwdbReviewDTO);
            JSONObject parse = (JSONObject) JSONObject.parse(s);
            //推送返回成功 修改审核状态为已审核 推送是否推送就业局为已推送
            if ("200".equals(parse.getString("statusCode"))) {
                updateSyncList.add(i.getId());
            }
        });
        //成功之后更新数据库
        exchangeProjectLoanMapper.updateSync(updateSyncList);
    }

    /**
     * 调用就业局 贷款审核接口（担保审核调用） 2.4.9.6
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
