package com.wander.cmis.service.impl;

import com.wander.cmis.bean.XwdbReviewDTO;
import com.wander.cmis.entity.ExhangeProjectLoan;
import com.wander.cmis.entity.ExhangeProjectLoanExample;
import com.wander.cmis.mapper.ExhangeProjectLoanMapper;
import com.wander.cmis.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("all")
public class LoanApplicationServiceImpl implements LoanApplicationService {

    @Autowired
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Autowired
    private ExhangeProjectLoanMapper exhangeProjectLoanMapper;

    @Override
    public XwdbReviewDTO convert() {
        XwdbReviewDTO xwdbReviewDTO = new XwdbReviewDTO();
        List<ExchangePolguaapp> exchangePolguaapp = exchangePolguaappMapper.selectByExample(new ExchangePolguaappExample());
        exchangePolguaapp.stream().forEach(i ->{
            //TODO 贷款编号
            xwdbReviewDTO.setTac001(0L);
            //TODO 审核日期
            xwdbReviewDTO.setTac093(0);
            //TODO 审核状态
            xwdbReviewDTO.setTac095("");
            //审核意见
            //小微担审核意见
            xwdbReviewDTO.setTac096(i.getXwdauditadvice());
            //贷款发放类型
            //贷款类型
            xwdbReviewDTO.setTac030a(i.getLoantype());
            //发放状态
            //放款状态
            xwdbReviewDTO.setTac083(i.getLoantag());
            //发放金额
            //创业担保贷款金额（元）
            xwdbReviewDTO.setTac097(i.getCreatebusiamount());
        });
        List<ExhangeProjectLoan> exhangeProjectLoans = exhangeProjectLoanMapper.selectByExample(new ExhangeProjectLoanExample());
        exhangeProjectLoans.stream().forEach(o -> {
            //发放日期
            //放款日期
            xwdbReviewDTO.setTac074(o.getLoandate());
            //贷款利率
            //贷款利率
            xwdbReviewDTO.setTac014(o.getLoanrate());
        });
        return xwdbReviewDTO;
    }

}
