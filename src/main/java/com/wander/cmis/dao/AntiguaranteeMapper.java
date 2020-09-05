package com.wander.cmis.dao;

import com.wander.cmis.entity.Antiguarantee;
import com.wander.cmis.entity.AntiguaranteeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AntiguaranteeMapper {
    int countByExample(AntiguaranteeExample example);

    int deleteByExample(AntiguaranteeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Antiguarantee record);

    int insertSelective(Antiguarantee record);

    List<Antiguarantee> selectByExample(AntiguaranteeExample example);

    Antiguarantee selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Antiguarantee record, @Param("example") AntiguaranteeExample example);

    int updateByExample(@Param("record") Antiguarantee record, @Param("example") AntiguaranteeExample example);

    int updateByPrimaryKeySelective(Antiguarantee record);

    int updateByPrimaryKey(Antiguarantee record);
}