package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.entity.ExchangePolguaappExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExchangePolguaappMapper {
    int countByExample(ExchangePolguaappExample example);

    int deleteByExample(ExchangePolguaappExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExchangePolguaapp record);

    int insertSelective(ExchangePolguaapp record);

    List<ExchangePolguaapp> selectByExample(ExchangePolguaappExample example);

    ExchangePolguaapp selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExchangePolguaapp record, @Param("example") ExchangePolguaappExample example);

    int updateByExample(@Param("record") ExchangePolguaapp record, @Param("example") ExchangePolguaappExample example);

    int updateByPrimaryKeySelective(ExchangePolguaapp record);

    int updateByPrimaryKey(ExchangePolguaapp record);

    void updateSuccess(@Param("list") List<String> list);
}