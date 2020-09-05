package com.wander.cmis.dao;

import com.wander.cmis.entity.Crmpersonal;
import com.wander.cmis.entity.CrmpersonalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmpersonalMapper {
    int countByExample(CrmpersonalExample example);

    int deleteByExample(CrmpersonalExample example);

    int deleteByPrimaryKey(String id);

    int insert(Crmpersonal record);

    int insertSelective(Crmpersonal record);

    List<Crmpersonal> selectByExample(CrmpersonalExample example);

    Crmpersonal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Crmpersonal record, @Param("example") CrmpersonalExample example);

    int updateByExample(@Param("record") Crmpersonal record, @Param("example") CrmpersonalExample example);

    int updateByPrimaryKeySelective(Crmpersonal record);

    int updateByPrimaryKey(Crmpersonal record);
}