package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeProjectLoan;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ExchangeProjectLoanMapper extends Mapper<ExchangeProjectLoan> {

    /**
     * 更新同步标识
     * @param id
     * @return
     */
    int updateSync(@Param("id")String id);

    /**
     * 查询需要推送的贷款发放数据
     * @return
     */
    List<ExchangeProjectLoan> selectByUnRead();

}