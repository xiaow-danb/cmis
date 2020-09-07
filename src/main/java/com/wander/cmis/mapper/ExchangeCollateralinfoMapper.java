package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeCollateralinfo;
import com.wander.cmis.entity.ExchangeCollateralinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExchangeCollateralinfoMapper {
    int countByExample(ExchangeCollateralinfoExample example);

    int deleteByExample(ExchangeCollateralinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExchangeCollateralinfo record);

    int insertSelective(ExchangeCollateralinfo record);

    List<ExchangeCollateralinfo> selectByExample(ExchangeCollateralinfoExample example);

    ExchangeCollateralinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExchangeCollateralinfo record, @Param("example") ExchangeCollateralinfoExample example);

    int updateByExample(@Param("record") ExchangeCollateralinfo record, @Param("example") ExchangeCollateralinfoExample example);

    int updateByPrimaryKeySelective(ExchangeCollateralinfo record);

    int updateByPrimaryKey(ExchangeCollateralinfo record);
}