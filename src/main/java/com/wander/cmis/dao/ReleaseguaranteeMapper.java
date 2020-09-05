package com.wander.cmis.dao;

import com.wander.cmis.entity.Releaseguarantee;
import com.wander.cmis.entity.ReleaseguaranteeExample;
import com.wander.cmis.entity.ReleaseguaranteeWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReleaseguaranteeMapper {
    int countByExample(ReleaseguaranteeExample example);

    int deleteByExample(ReleaseguaranteeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ReleaseguaranteeWithBLOBs record);

    int insertSelective(ReleaseguaranteeWithBLOBs record);

    List<ReleaseguaranteeWithBLOBs> selectByExampleWithBLOBs(ReleaseguaranteeExample example);

    List<Releaseguarantee> selectByExample(ReleaseguaranteeExample example);

    ReleaseguaranteeWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ReleaseguaranteeWithBLOBs record, @Param("example") ReleaseguaranteeExample example);

    int updateByExampleWithBLOBs(@Param("record") ReleaseguaranteeWithBLOBs record, @Param("example") ReleaseguaranteeExample example);

    int updateByExample(@Param("record") Releaseguarantee record, @Param("example") ReleaseguaranteeExample example);

    int updateByPrimaryKeySelective(ReleaseguaranteeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ReleaseguaranteeWithBLOBs record);

    int updateByPrimaryKey(Releaseguarantee record);
}