package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExhangeProjectLoan;
import com.wander.cmis.entity.ExhangeProjectLoanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExhangeProjectLoanMapper {
    int countByExample(ExhangeProjectLoanExample example);

    int deleteByExample(ExhangeProjectLoanExample example);

    int insert(ExhangeProjectLoan record);

    int insertSelective(ExhangeProjectLoan record);

    List<ExhangeProjectLoan> selectByExample(ExhangeProjectLoanExample example);

    int updateByExampleSelective(@Param("record") ExhangeProjectLoan record, @Param("example") ExhangeProjectLoanExample example);

    int updateByExample(@Param("record") ExhangeProjectLoan record, @Param("example") ExhangeProjectLoanExample example);
}