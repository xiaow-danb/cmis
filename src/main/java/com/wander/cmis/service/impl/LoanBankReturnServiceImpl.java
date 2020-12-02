package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wander.cmis.bean.BankReturnDto;
import com.wander.cmis.entity.ExchangeBankReturn;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.mapper.ExchangePolguaappMapper;
import com.wander.cmis.service.LoanBankReturnService;
import com.wondersgroup.commons.json.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanBankReturnServiceImpl implements LoanBankReturnService {

    private static final Logger logger = LoggerFactory.getLogger(LoanBankReturnServiceImpl.class);

    @Autowired
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Override
    public JsonResult bankReturn(BankReturnDto bankReturnDto) {
        logger.info("同步就业局银行退回结果开始:");
        logger.info("请求参数：" + JSONObject.toJSON(bankReturnDto).toString());
        if (bankReturnDto == null) {
            logger.info("bankReturnDto");
            return new JsonResult("入参不能为空");
        }
        if (bankReturnDto.getApplyNo().isEmpty()) {
            return new JsonResult("贷款编号不能为空");
        }
        if (bankReturnDto.getApplyDate().isEmpty()) {
            return new JsonResult("贷款申请时间不能为空");
        }
        if (bankReturnDto.getReturnDate().isEmpty()) {
            return new JsonResult("贷款退回时间不能为空");
        }

        String applyNo = bankReturnDto.getApplyNo();
        String applyDate = bankReturnDto.getApplyDate();
        ExchangePolguaapp polguaapp = exchangePolguaappMapper.findByApplyNo(applyNo,applyDate);
        return null;
    }
}
