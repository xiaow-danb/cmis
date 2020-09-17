package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeCollateralinfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface ExchangeCollateralinfoMapper extends Mapper<ExchangeCollateralinfo> {

    List<ExchangeCollateralinfo> findexchangeCollateralinfoByloanId(@Param(value = "id") String id);
}