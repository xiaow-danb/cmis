package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangeBank;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ExchangeBankMapper extends Mapper<ExchangeBank> {
    ExchangeBank seleByCode(@Param("jyjbankid") String jyjbankid,
                            @Param("jyjindustry") String jyjindustry);

}
