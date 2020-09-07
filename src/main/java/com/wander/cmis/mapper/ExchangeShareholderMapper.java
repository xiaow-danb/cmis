package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeShareholder;
import com.wander.cmis.entity.ExchangeShareholderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExchangeShareholderMapper {
    int countByExample(ExchangeShareholderExample example);

    int deleteByExample(ExchangeShareholderExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExchangeShareholder record);

    int insertSelective(ExchangeShareholder record);

    List<ExchangeShareholder> selectByExample(ExchangeShareholderExample example);

    ExchangeShareholder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExchangeShareholder record, @Param("example") ExchangeShareholderExample example);

    int updateByExample(@Param("record") ExchangeShareholder record, @Param("example") ExchangeShareholderExample example);

    int updateByPrimaryKeySelective(ExchangeShareholder record);

    int updateByPrimaryKey(ExchangeShareholder record);
}