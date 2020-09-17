package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeGuarantorinfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ExchangeGuarantorinfoMapper extends Mapper<ExchangeGuarantorinfo> {

    List<ExchangeGuarantorinfo> findGuarantorinfoByloanId(@Param(value = "id") String id);
}