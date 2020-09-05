package com.wander.cmis.dao;

import com.wander.cmis.entity.Projectloan;
import com.wander.cmis.entity.ProjectloanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProjectloanMapper {
    int countByExample(ProjectloanExample example);

    int deleteByExample(ProjectloanExample example);

    int deleteByPrimaryKey(String id);

    int insert(Projectloan record);

    int insertSelective(Projectloan record);

    List<Projectloan> selectByExample(ProjectloanExample example);

    Projectloan selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Projectloan record, @Param("example") ProjectloanExample example);

    int updateByExample(@Param("record") Projectloan record, @Param("example") ProjectloanExample example);

    int updateByPrimaryKeySelective(Projectloan record);

    int updateByPrimaryKey(Projectloan record);
}