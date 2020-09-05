package com.wander.cmis.dao;

import com.wander.cmis.entity.Extractapprovalapplydetail;
import com.wander.cmis.entity.ExtractapprovalapplydetailExample;
import com.wander.cmis.entity.ExtractapprovalapplydetailWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExtractapprovalapplydetailMapper {
    int countByExample(ExtractapprovalapplydetailExample example);

    int deleteByExample(ExtractapprovalapplydetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExtractapprovalapplydetailWithBLOBs record);

    int insertSelective(ExtractapprovalapplydetailWithBLOBs record);

    List<ExtractapprovalapplydetailWithBLOBs> selectByExampleWithBLOBs(ExtractapprovalapplydetailExample example);

    List<Extractapprovalapplydetail> selectByExample(ExtractapprovalapplydetailExample example);

    ExtractapprovalapplydetailWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExtractapprovalapplydetailWithBLOBs record, @Param("example") ExtractapprovalapplydetailExample example);

    int updateByExampleWithBLOBs(@Param("record") ExtractapprovalapplydetailWithBLOBs record, @Param("example") ExtractapprovalapplydetailExample example);

    int updateByExample(@Param("record") Extractapprovalapplydetail record, @Param("example") ExtractapprovalapplydetailExample example);

    int updateByPrimaryKeySelective(ExtractapprovalapplydetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ExtractapprovalapplydetailWithBLOBs record);

    int updateByPrimaryKey(Extractapprovalapplydetail record);
}