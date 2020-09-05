package com.wander.cmis.dao;

import com.wander.cmis.entity.CrmenterpriseExt;
import com.wander.cmis.entity.CrmenterpriseExtExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CrmenterpriseExtMapper {
    int countByExample(CrmenterpriseExtExample example);

    int deleteByExample(CrmenterpriseExtExample example);

    int deleteByPrimaryKey(String id);

    int insert(CrmenterpriseExt record);

    int insertSelective(CrmenterpriseExt record);

    List<CrmenterpriseExt> selectByExample(CrmenterpriseExtExample example);

    CrmenterpriseExt selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CrmenterpriseExt record, @Param("example") CrmenterpriseExtExample example);

    int updateByExample(@Param("record") CrmenterpriseExt record, @Param("example") CrmenterpriseExtExample example);

    int updateByPrimaryKeySelective(CrmenterpriseExt record);

    int updateByPrimaryKey(CrmenterpriseExt record);
}