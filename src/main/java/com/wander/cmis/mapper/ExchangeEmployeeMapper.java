package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeEmployee;
import com.wander.cmis.entity.ExchangeEmployeeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExchangeEmployeeMapper {
    int countByExample(ExchangeEmployeeExample example);

    int deleteByExample(ExchangeEmployeeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExchangeEmployee record);

    int insertSelective(ExchangeEmployee record);

    List<ExchangeEmployee> selectByExample(ExchangeEmployeeExample example);

    ExchangeEmployee selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExchangeEmployee record, @Param("example") ExchangeEmployeeExample example);

    int updateByExample(@Param("record") ExchangeEmployee record, @Param("example") ExchangeEmployeeExample example);

    int updateByPrimaryKeySelective(ExchangeEmployee record);

    int updateByPrimaryKey(ExchangeEmployee record);
}