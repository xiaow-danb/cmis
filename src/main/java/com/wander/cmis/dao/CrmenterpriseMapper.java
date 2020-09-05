package com.wander.cmis.dao;

import com.wander.cmis.entity.Crmenterprise;
import com.wander.cmis.entity.CrmenterpriseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CrmenterpriseMapper {
    int countByExample(CrmenterpriseExample example);

    int deleteByExample(CrmenterpriseExample example);

    int deleteByPrimaryKey(String id);

    int insert(Crmenterprise record);

    int insertSelective(Crmenterprise record);

    List<Crmenterprise> selectByExample(CrmenterpriseExample example);

    Crmenterprise selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Crmenterprise record, @Param("example") CrmenterpriseExample example);

    int updateByExample(@Param("record") Crmenterprise record, @Param("example") CrmenterpriseExample example);

    int updateByPrimaryKeySelective(Crmenterprise record);

    int updateByPrimaryKey(Crmenterprise record);
}