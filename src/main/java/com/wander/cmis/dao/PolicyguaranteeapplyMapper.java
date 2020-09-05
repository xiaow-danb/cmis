package com.wander.cmis.dao;

import com.wander.cmis.entity.Policyguaranteeapply;
import com.wander.cmis.entity.PolicyguaranteeapplyExample;
import com.wander.cmis.entity.PolicyguaranteeapplyWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PolicyguaranteeapplyMapper {
    int countByExample(PolicyguaranteeapplyExample example);

    int deleteByExample(PolicyguaranteeapplyExample example);

    int deleteByPrimaryKey(String id);

    int insert(PolicyguaranteeapplyWithBLOBs record);

    int insertSelective(PolicyguaranteeapplyWithBLOBs record);

    List<PolicyguaranteeapplyWithBLOBs> selectByExampleWithBLOBs(PolicyguaranteeapplyExample example);

    List<Policyguaranteeapply> selectByExample(PolicyguaranteeapplyExample example);

    PolicyguaranteeapplyWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PolicyguaranteeapplyWithBLOBs record, @Param("example") PolicyguaranteeapplyExample example);

    int updateByExampleWithBLOBs(@Param("record") PolicyguaranteeapplyWithBLOBs record, @Param("example") PolicyguaranteeapplyExample example);

    int updateByExample(@Param("record") Policyguaranteeapply record, @Param("example") PolicyguaranteeapplyExample example);

    int updateByPrimaryKeySelective(PolicyguaranteeapplyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PolicyguaranteeapplyWithBLOBs record);

    int updateByPrimaryKey(Policyguaranteeapply record);
}