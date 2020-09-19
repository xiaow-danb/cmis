package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeEmployee;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ExchangeEmployeeMapper extends Mapper<ExchangeEmployee> {
    List<ExchangeEmployee> selectByLoanId(@Param("id") String id);
}