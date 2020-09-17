package com.wander.cmis.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.wander.cmis.bean.PolguaappDto;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.mapper.ExchangePolguaappMapper;
import com.wander.cmis.service.LoanPolguaappService;
import com.wondersgroup.wssip.framework.common.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * 对外提供接口处理就业局返回审批结果
 */
@Service
public class LoanPolguaappServiceImpl implements LoanPolguaappService {

    private static final Logger logger = LoggerFactory.getLogger(LoanPolguaappServiceImpl.class);

    @Resource
    private ExchangePolguaappMapper polguaappMapper;


    @Override
    public JsonResult syncAudit(PolguaappDto polguaappDto) {
        if(polguaappDto == null){
            return new JsonResult("入参不能为空");
        }
        if(polguaappDto.getHandlingno() == null || "".equals(polguaappDto.getHandlingno())){
            return new JsonResult("公共服务编号不能为空");
        }
        //获取中间表数据 新增一条数据
        ExchangePolguaapp  polguaapp = polguaappMapper.findByXwdOrjyjNo(polguaappDto.getHandlingno());
        //修改对应的字段
        polguaapp.setExchangeType("TOXWD");
        polguaapp.setId(UUID.randomUUID().toString().replace("-",""));
        polguaapp.setAuditresult(polguaappDto.getAutidResult());
        polguaapp.setApplyno(polguaappDto.getApplyNo());
        polguaapp.setAuditdate(polguaappDto.getAutidDate());
        polguaapp.setAuditadvice(polguaappDto.getRemark());
        try {
            polguaappMapper.insertSelective(polguaapp);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(e.getMessage());
        }
        return new JsonResult();
    }
}
