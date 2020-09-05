package com.wander.cmis.dao;

import com.wander.cmis.entity.Crmshareholder;
import com.wander.cmis.entity.CrmshareholderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CrmshareholderMapper {
    int countByExample(CrmshareholderExample example);

    int deleteByExample(CrmshareholderExample example);

    int deleteByPrimaryKey(String id);

    int insert(Crmshareholder record);

    int insertSelective(Crmshareholder record);

    List<Crmshareholder> selectByExample(CrmshareholderExample example);

    Crmshareholder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Crmshareholder record, @Param("example") CrmshareholderExample example);

    int updateByExample(@Param("record") Crmshareholder record, @Param("example") CrmshareholderExample example);

    int updateByPrimaryKeySelective(Crmshareholder record);

    int updateByPrimaryKey(Crmshareholder record);
}