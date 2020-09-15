package com.wander.cmis.mapper;

import com.wander.cmis.entity.ExchangePolguaapp;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ExchangePolguaappMapper extends Mapper<ExchangePolguaapp> {
    int updateSuccess(List<String> list);
}