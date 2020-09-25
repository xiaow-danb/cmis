package com.wander.cmis.service.impl;

import com.wander.cmis.bean.CompanyInfoDto;
import com.wander.cmis.bean.PersonalInfoDto;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.mapper.ExchangePolguaappMapper;
import com.wander.cmis.service.TransferCustService;
import com.wondersgroup.commons.json.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class TransferCustServiceImpl implements TransferCustService {

    private static final Logger logger = LoggerFactory.getLogger(TransferCustServiceImpl.class);

    @Resource
    private ExchangePolguaappMapper polguaappMapper;

    @Override
    public JsonResult syncPersonal(PersonalInfoDto personalInfoDto) {
        List<String> list = new ArrayList<>();
        logger.info("同步就业局个人信息审核结果开始:");
        logger.info("请求参数："+personalInfoDto.toString());
        if(personalInfoDto == null){
            logger.info("polguaappDto对象为空");
            return new JsonResult("入参不能为空");
        }
        if(personalInfoDto.getIdCard().isEmpty()){
            return new JsonResult("身份证号码不能为空");
        }
        if(personalInfoDto.getAutidResult().isEmpty()){
            return new JsonResult("审批结果不能为空");
        }
        if("yes".equals(personalInfoDto.getAutidResult())){
            //推送贷款申请信息 TODO
        }
        if("no".equals(personalInfoDto.getAutidResult())){
            Example example = new Example(ExchangePolguaapp.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("CREDENTIALNO",personalInfoDto.getIdCard());
            List<ExchangePolguaapp> list1 = polguaappMapper.selectByExample(example);
            for (int i = 0,len = list1.size(); i < len; i++) {
                ExchangePolguaapp polguaapp = list1.get(i);
                polguaapp.setAuditdate(personalInfoDto.getAutidDate());
                polguaapp.setAuditresult(personalInfoDto.getAutidResult());
                polguaapp.setAuditdate(personalInfoDto.getAutidDate());
                polguaapp.setAuditadvice(personalInfoDto.getRemark());
                polguaapp.setReadtag1((short)1);
                polguaappMapper.updateByPrimaryKey(polguaapp);
            }
        }
        return new JsonResult();
    }

    @Override
    public JsonResult syncCompany(CompanyInfoDto companyInfoDto) {
        logger.info("同步就业局个人信息审核结果开始:");
        logger.info("请求参数："+companyInfoDto.toString());
        if(companyInfoDto == null){
            logger.info("polguaappDto对象为空");
            return new JsonResult("入参不能为空");
        }
        if(companyInfoDto.getLicensenum().isEmpty()){
            return new JsonResult("统一社会信息编码不能为空");
        }
        if(companyInfoDto.getAutidResult().isEmpty()){
            return new JsonResult("审批结果不能为空");
        }
        if("yes".equals(companyInfoDto.getAutidResult())){
            //推送贷款申请信息 TODO
        }
        if("no".equals(companyInfoDto.getAutidResult())){
            Example example = new Example(ExchangePolguaapp.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("Licensenum",companyInfoDto.getLicensenum());
            List<ExchangePolguaapp> list1 = polguaappMapper.selectByExample(example);
            for (int i = 0,len = list1.size(); i < len; i++) {
                ExchangePolguaapp polguaapp = list1.get(i);
                polguaapp.setAuditdate(companyInfoDto.getAutidDate());
                polguaapp.setAuditresult(companyInfoDto.getAutidResult());
                polguaapp.setAuditdate(companyInfoDto.getAutidDate());
                polguaapp.setAuditadvice(companyInfoDto.getRemark());
                polguaapp.setReadtag1((short)1);
                polguaappMapper.updateByPrimaryKey(polguaapp);
            }
        }
        return new JsonResult();
    }
}
