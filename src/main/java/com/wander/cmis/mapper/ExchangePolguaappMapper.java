package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangePolguaapp;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ExchangePolguaappMapper extends Mapper<ExchangePolguaapp> {
    int updateSuccess(@Param(value = "handingNo") String handingNo,@Param(value = "id") String id);

    List<ExchangePolguaapp> selectSyncAndNofail();

    List<ExchangePolguaapp> selectAuditStatus();

    ExchangePolguaapp findByXwdOrjyjNo(@Param(value = "applyno") String applyno);

    List<ExchangePolguaapp> selectCompanySync();

    int updateSync(@Param("id") String id);

    List<ExchangePolguaapp> personalText();

    List<ExchangePolguaapp> test();

    int updatePersonSyncStatus(@Param("id") String id);

    int updateUnitSyncStatus(String id);

    List<ExchangePolguaapp> selectByHitsoty();

    int updateList(@Param("updateList") List<String> updateList);

    /**
     * 保证就业局推送审核数据的时候 如果小微单没审核 只存在一条数据
     * @param applyNo
     * @return
     */
    ExchangePolguaapp findByAppNoAndReadtag2(@Param("applyNo") String applyNo);

    void updateBySuccessRecord(@Param("id") String id);
}