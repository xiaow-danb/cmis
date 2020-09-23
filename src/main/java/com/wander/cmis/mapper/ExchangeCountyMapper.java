package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeCounty;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ExchangeCountyMapper extends Mapper<ExchangeCounty> {
    ExchangeCounty seleByCode(@Param("domicile") String domicile);

}
