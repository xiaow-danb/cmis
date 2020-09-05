package com.wander.cmis.dao;

import com.wander.cmis.entity.Extractapprovalapply;
import com.wander.cmis.entity.ExtractapprovalapplyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExtractapprovalapplyMapper {
    int countByExample(ExtractapprovalapplyExample example);

    int deleteByExample(ExtractapprovalapplyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Extractapprovalapply record);

    int insertSelective(Extractapprovalapply record);

    List<Extractapprovalapply> selectByExampleWithBLOBs(ExtractapprovalapplyExample example);

    List<Extractapprovalapply> selectByExample(ExtractapprovalapplyExample example);

    Extractapprovalapply selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Extractapprovalapply record, @Param("example") ExtractapprovalapplyExample example);

    int updateByExampleWithBLOBs(@Param("record") Extractapprovalapply record, @Param("example") ExtractapprovalapplyExample example);

    int updateByExample(@Param("record") Extractapprovalapply record, @Param("example") ExtractapprovalapplyExample example);

    int updateByPrimaryKeySelective(Extractapprovalapply record);

    int updateByPrimaryKeyWithBLOBs(Extractapprovalapply record);

    int updateByPrimaryKey(Extractapprovalapply record);
}