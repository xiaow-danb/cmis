package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangePolguaapp;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ExchangePolguaappMapper extends Mapper<ExchangePolguaapp> {
    int updateSuccess(@Param(value = "handingNo") String handingNo,@Param(value = "id") String id);

    List<ExchangePolguaapp> selectSyncAndNofail();

    List<ExchangePolguaapp> selectAuditStatus();

    ExchangePolguaapp findByXwdOrjyjNo(@Param(value = "handingNo") String handingNo);

    List<ExchangePolguaapp> selectCompanySync();

    int updateSync(List<String> updateSyncList);
}