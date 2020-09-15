package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeProjectLoan;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ExchangeProjectLoanMapper extends Mapper<ExchangeProjectLoan> {
    int updateSync(List<String> updateSyncList);
}