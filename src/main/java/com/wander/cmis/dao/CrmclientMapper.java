package com.wander.cmis.dao;

import com.wander.cmis.entity.Crmclient;
import com.wander.cmis.entity.CrmclientExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CrmclientMapper {
    int countByExample(CrmclientExample example);

    int deleteByExample(CrmclientExample example);

    int deleteByPrimaryKey(String id);

    int insert(Crmclient record);

    int insertSelective(Crmclient record);

    List<Crmclient> selectByExample(CrmclientExample example);

    Crmclient selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Crmclient record, @Param("example") CrmclientExample example);

    int updateByExample(@Param("record") Crmclient record, @Param("example") CrmclientExample example);

    int updateByPrimaryKeySelective(Crmclient record);

    int updateByPrimaryKey(Crmclient record);
}