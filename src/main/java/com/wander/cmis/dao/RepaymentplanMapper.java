package com.wander.cmis.dao;

import com.wander.cmis.entity.Repaymentplan;
import com.wander.cmis.entity.RepaymentplanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RepaymentplanMapper {
    int countByExample(RepaymentplanExample example);

    int deleteByExample(RepaymentplanExample example);

    int deleteByPrimaryKey(String id);

    int insert(Repaymentplan record);

    int insertSelective(Repaymentplan record);

    List<Repaymentplan> selectByExample(RepaymentplanExample example);

    Repaymentplan selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Repaymentplan record, @Param("example") RepaymentplanExample example);

    int updateByExample(@Param("record") Repaymentplan record, @Param("example") RepaymentplanExample example);

    int updateByPrimaryKeySelective(Repaymentplan record);

    int updateByPrimaryKey(Repaymentplan record);
}