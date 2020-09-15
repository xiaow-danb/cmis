package com.wander.cmis.service.impl;

import com.wander.cmis.bean.XwdbReviewDTO;
import com.wander.cmis.entity.ExchangeProjectLoan;
import com.wander.cmis.mapper.ExchangeProjectLoanMapper;
import com.wander.cmis.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@SuppressWarnings("all")
public class LoanApplicationServiceImpl implements LoanApplicationService {

    @Autowired
    private ExchangeProjectLoanMapper exchangeProjectLoanMapper;

    @Override
    public void convert() {
        List<ExchangeProjectLoan> exhangeProjectLoans = exchangeProjectLoanMapper.selectAll();
        exhangeProjectLoans.stream().forEach(i ->{
            XwdbReviewDTO xwdbReviewDTO = new XwdbReviewDTO();
            //贷款编号 取的中间表(放款信息)的id
            xwdbReviewDTO.setTac001(Long.parseLong(i.getId()));
            //审核日期
            xwdbReviewDTO.setTac093((int) i.getAuditDate().getTime());
            //审核状态
            xwdbReviewDTO.setTac095(i.getAuditStatus());
            //审核意见
            xwdbReviewDTO.setTac096(i.getAuditAdvice());
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
             * TODO
             * 1.判断审核状态,贷款发放的数据才同步
             * 2.同步is_sync为0的才同步
             * 3.将已同步的数据同步状态标识更新为1
             */

            List<String> updateSyncList = new ArrayList();
            exchangeProjectLoanMapper.updateSync(updateSyncList);
        });
    }

}
