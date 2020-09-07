package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeGuarantorinfo;
import com.wander.cmis.entity.ExchangeGuarantorinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExchangeGuarantorinfoMapper {
    int countByExample(ExchangeGuarantorinfoExample example);

    int deleteByExample(ExchangeGuarantorinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExchangeGuarantorinfo record);

    int insertSelective(ExchangeGuarantorinfo record);

    List<ExchangeGuarantorinfo> selectByExample(ExchangeGuarantorinfoExample example);

    ExchangeGuarantorinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExchangeGuarantorinfo record, @Param("example") ExchangeGuarantorinfoExample example);

    int updateByExample(@Param("record") ExchangeGuarantorinfo record, @Param("example") ExchangeGuarantorinfoExample example);

    int updateByPrimaryKeySelective(ExchangeGuarantorinfo record);

    int updateByPrimaryKey(ExchangeGuarantorinfo record);
}