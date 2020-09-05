package com.wander.cmis.dao;

import com.wander.cmis.entity.CrmpersonalExt;
import com.wander.cmis.entity.CrmpersonalExtExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CrmpersonalExtMapper {
    int countByExample(CrmpersonalExtExample example);

    int deleteByExample(CrmpersonalExtExample example);

    int deleteByPrimaryKey(String id);

    int insert(CrmpersonalExt record);

    int insertSelective(CrmpersonalExt record);

    List<CrmpersonalExt> selectByExampleWithBLOBs(CrmpersonalExtExample example);

    List<CrmpersonalExt> selectByExample(CrmpersonalExtExample example);

    CrmpersonalExt selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CrmpersonalExt record, @Param("example") CrmpersonalExtExample example);

    int updateByExampleWithBLOBs(@Param("record") CrmpersonalExt record, @Param("example") CrmpersonalExtExample example);

    int updateByExample(@Param("record") CrmpersonalExt record, @Param("example") CrmpersonalExtExample example);

    int updateByPrimaryKeySelective(CrmpersonalExt record);

    int updateByPrimaryKeyWithBLOBs(CrmpersonalExt record);

    int updateByPrimaryKey(CrmpersonalExt record);
}