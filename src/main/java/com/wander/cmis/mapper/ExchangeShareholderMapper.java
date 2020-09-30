package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeShareholder;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ExchangeShareholderMapper extends Mapper<ExchangeShareholder> {
    List<ExchangeShareholder> selectByLoanId(@Param("id") String id);
}