package com.wander.cmis.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.PolguaappDto;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.*;
import com.wander.cmis.mapper.*;
import com.wander.cmis.service.LoanPolguaappService;
import com.wander.cmis.utils.BeanUtil;
import com.wonders.cqjy.ggfw.api.XwdbApi;
import com.wonders.cqjy.ggfw.dto.*;
import com.wondersgroup.commons.json.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 对外提供接口处理就业局返回审批结果
 */
@Service
@Transactional
public class LoanPolguaappServiceImpl implements LoanPolguaappService {

    private static final Logger logger = LoggerFactory.getLogger(LoanPolguaappServiceImpl.class);

    @Resource
    private ExchangePolguaappMapper polguaappMapper;

    @Resource
    private ExchangeGuarantorinfoMapper exchangeGuarantorinfoMapper;

    @Resource
    private ExchangeEmployeeMapper exchangeEmployeeMapper;

    @Resource
    private ExchangeCollateralinfoMapper exchangeCollateralinfoMapper;

    @Resource
    private ExchangeShareholderMapper shareholderMapper;

    @Resource
    private ExchangeCountyMapper exchangeCountyMapper;

    @Resource
    private ErrorLogMapper errorLogMapper;

    @Value("${restUrl}")
    private String restUrl;

    @Override
    public JsonResult syncAudit(PolguaappDto polguaappDto) {
        logger.info("同步就业局审核结果开始:");
        logger.info("请求参数：" + JSONObject.toJSON(polguaappDto).toString());
        if (polguaappDto == null) {
            logger.info("polguaappDto对象为空");
            return new JsonResult("入参不能为空");
        }
        if (polguaappDto.getApplyNo().isEmpty()) {
            return new JsonResult("贷款编号不能为空");
        }
        if (polguaappDto.getType().isEmpty()) {
            return new JsonResult("业务类型不能为空");
        }
        if (polguaappDto.getAutidResult().isEmpty()) {
            return new JsonResult("审批结果不能为空");
        }
        if (polguaappDto.getSourceType().isEmpty()) {
            return new JsonResult("申请来源不能为空");
        }
        if (!"P".equals(polguaappDto.getSourceType()) && !"X".equals(polguaappDto.getSourceType())) {
            return new JsonResult("申请来源类型有误请核实");
        }

        try {
            //获取中间表数据 新增一条数据
//            ExchangePolguaapp polguaapp = polguaappMapper.findByXwdOrjyjNo(polguaappDto.getHandlingno());

            //modify by wpx
            ExchangePolguaapp polguaapp = polguaappMapper.findByAppNoAndReadtag2(polguaappDto.getApplyNo());
            if (!StringUtils.isEmpty(polguaapp)) {
//                polguaappMapper.updateByPrimaryKeySelective(polguaapp);
                //不做更新 保留上一条
                return new JsonResult("本条审核数据已同步,无需再次保存重复数据,流程继续.------->applyNo" + polguaappDto.getApplyNo());
            }

            /**
             * 逻辑处理判断
             * 如果 没有查询到，说明是就业局线下的。 线下的需要我们手动查询申请单
             * 如果有，说明是我们现在的，
             */
            if (polguaapp == null || "".equals(polguaapp.getId()) || polguaapp.getId() == null || "null".equals(polguaapp.getId())) {
                //说明是没有申请的需要调用就业局查询
                if ("01".equals(polguaappDto.getType())) {
                    //个人贷款申请
                    logger.info("获取个人贷款申请信息：贷款编号为:" + polguaappDto.getApplyNo());
                    String res = getLoanApplyPersonal(polguaappDto.getApplyNo());
                    logger.info("返回信息：" + res);
                    JSONObject jsonObject = (JSONObject) JSONObject.parse(res);
                    if ("200" .equals(jsonObject.getString("statusCode"))) {
//                        XwdbLoanDTO dto = (XwdbLoanDTO) jsonResult.getResult();
                        String result = jsonObject.getString("result");
                        XwdbLoanDTO dto = JSONObject.parseObject(result, XwdbLoanDTO.class);
                        ExchangePolguaapp personal = BeanUtil.createPolguaappPersonal(dto, "01");
                        String domicile = personal.getDomicile();
                        if(personal.getDomicile().contains("500230")){
                            logger.info("该条贷款申请为丰都县");
                            return new JsonResult("该条贷款申请为丰都县");
                        }
                        /*String jyjbankid =personal.getLoanorgId();
                        String jyjindustry = domicile;
                        if(!"".equals(domicile) && domicile != null && jyjbankid != null && !"".equals(jyjbankid)) {
                            //银行id
                            logger.info("获取银行id："+jyjbankid+"------"+jyjindustry);
                            ExchangeBank exchangeBank = exchangeBankMapper.seleByCode(jyjbankid, jyjindustry);
                            personal.setLoanorgId(exchangeBank.getId().toString());
                        }*/
                        if (!"".equals(domicile) && domicile != null) {
                            ExchangeCounty exchangeCounty = exchangeCountyMapper.seleByCode(domicile);
                            personal.setDomicile(exchangeCounty.getId());
                        }
                        domicile = personal.getStreet();
                        if (!"".equals(domicile) && domicile != null) {
                            ExchangeCounty exchangeCounty = exchangeCountyMapper.seleByCode(domicile);
                            personal.setStreet(exchangeCounty.getId());
                        }
                        personal.setExchangeType("TOXWD");
                        personal.setId(UUID.randomUUID().toString().replace("-", ""));
                        personal.setAuditresult(polguaappDto.getAutidResult());
                        personal.setApplyno(polguaappDto.getApplyNo());
                        personal.setAuditdate(polguaappDto.getAutidDate());
                        personal.setAuditadvice(polguaappDto.getRemark());
                        personal.setSourcetype(polguaappDto.getSourceType());
                        //担保方式
                        personal.setGuarmethod("03");
                        //银行id
                        personal.setLoanorgId(polguaappDto.getBankId());
                        //保存保证人
                        List<LoanJm65ApiDto> loanJm65ApiDtos = dto.getJm65ApiDtos();
                        //保存抵质押物
                        List<LoanJm66ApiDto> loanJm66ApiDtos = dto.getJm66ApiDtos();
                        if(loanJm65ApiDtos!= null && loanJm65ApiDtos.size()>0){
                            personal.setGuarmethod("01");
                        }
                        if(loanJm66ApiDtos!= null && loanJm66ApiDtos.size()>0){
                            personal.setGuarmethod("02");
                        }
                        if(loanJm65ApiDtos!= null && loanJm65ApiDtos.size()>0 && loanJm66ApiDtos!= null && loanJm66ApiDtos.size()>0){
                            personal.setGuarmethod("05");
                        }
                        //保存申请单
                        logger.info("保存个人贷款申请单编号：" + personal.getApplyno());
                        polguaappMapper.insertSelective(personal);

                        if (loanJm65ApiDtos != null && loanJm65ApiDtos.size() > 0) {
                            for (int j = 0; j < loanJm65ApiDtos.size(); j++) {
                                ExchangeGuarantorinfo guarantorinfo = BeanUtil.createGuarantorinfo(loanJm65ApiDtos.get(j));
                                guarantorinfo.setLoanapplyid(personal.getId());
                                logger.info("保存保证人信息编号：" + guarantorinfo.getLoanapplyid());
                                guarantorinfo.setId(UUID.randomUUID().toString().replace("-", ""));
                                exchangeGuarantorinfoMapper.insertSelective(guarantorinfo);
                            }
                        }
                        if (loanJm66ApiDtos != null && loanJm66ApiDtos.size() > 0) {
                            for (int j = 0; j < loanJm66ApiDtos.size(); j++) {
                                ExchangeCollateralinfo collateralinfo = BeanUtil.createCollateralinfo(loanJm66ApiDtos.get(j));
                                collateralinfo.setId(UUID.randomUUID().toString().replace("-", ""));
                                collateralinfo.setLoanapplyid(personal.getId());
                                logger.info("保存抵质押物信息编号：" + collateralinfo.getLoanapplyid());
                                exchangeCollateralinfoMapper.insertSelective(collateralinfo);
                            }
                        }
                    } else {
                        //获取失败
                        logger.info("获取就业局个人贷款申请详情接口失败，贷款申请编号为：" + polguaappDto.getApplyNo());
//                        logger.error(jsonResult.getStatusCode()+"--"+jsonResult.getMessage());
                        /**
                         * 添加错误日志到日志表
                         */
                        ErrorLog errorLog = new ErrorLog();
                        errorLog.setId(UUID.randomUUID().toString().replace("-", ""));
                        errorLog.setJyjInterface("2.4.9.3 个人贷款详细信息接口");
                        errorLog.setSendData(polguaappDto.getApplyNo());
                        errorLog.setResultData(res);
                        errorLogMapper.insert(errorLog);
                        return new JsonResult("获取就业贷款信息失败");
                    }
                }
                if ("02".equals(polguaappDto.getType())) {
                    //企业贷款申请
                    logger.info("获取企业贷款申请信息：贷款编号为:" + polguaappDto.getApplyNo());
                    String res = getLoanApplyCompany(polguaappDto.getApplyNo());
                    logger.info("返回信息：" + res);
                    JSONObject jsonObject = (JSONObject) JSONObject.parse(res);
                    if ("200" .equals(jsonObject.getString("statusCode"))) {
                        String result = jsonObject.getString("result");
                        XwdbLoanDTO dto = JSONObject.parseObject(result, XwdbLoanDTO.class);
                        //保存申请单
                        ExchangePolguaapp personal = BeanUtil.createPolguaappPersonal(dto, "02");
                        //保存申请单
                        personal.setExchangeType("TOXWD");
                        personal.setId(UUID.randomUUID().toString().replace("-", ""));
                        personal.setAuditresult(polguaappDto.getAutidResult());
                        personal.setApplyno(polguaappDto.getApplyNo());
                        personal.setAuditdate(polguaappDto.getAutidDate());
                        personal.setAuditadvice(polguaappDto.getRemark());
                        personal.setSourcetype(polguaappDto.getSourceType());
                        String domicile = personal.getDomicile();
                        //银行id
                        personal.setLoanorgId(polguaappDto.getBankId());
                        /*String jyjbankid =personal.getLoanorgId();
                        String jyjindustry = domicile;
                        if(!"".equals(domicile) && domicile != null && jyjbankid != null && !"".equals(jyjbankid)) {
                            //银行id
                            logger.info("获取银行id："+jyjbankid+"------"+jyjindustry);
                            ExchangeBank exchangeBank = exchangeBankMapper.seleByCode(jyjbankid, jyjindustry);
                            personal.setLoanorgId(exchangeBank.getId().toString());
                        }*/
                        if(personal.getDomicile().contains("500230")){
                            logger.info("该条贷款申请为丰都县");
                            return new JsonResult("该条贷款申请为丰都县");
                        }
                        if (!"".equals(domicile) && domicile != null) {
                            ExchangeCounty exchangeCounty = exchangeCountyMapper.seleByCode(domicile);
                            personal.setDomicile(exchangeCounty.getId());
                        }
                        domicile = personal.getStreet();
                        if (!"".equals(domicile) && domicile != null) {
                            ExchangeCounty exchangeCounty = exchangeCountyMapper.seleByCode(domicile);
                            personal.setStreet(exchangeCounty.getId());
                        }
                        logger.info("保存企业贷款申请信息编号：" + personal.getApplyno());
                        polguaappMapper.insertSelective(personal);
                        //股东列表
                        List<StockholderApiDto> stockholderApiDtos = dto.getStockholderApiDtos();
                        if (stockholderApiDtos != null && stockholderApiDtos.size() > 0) {
                            stockholderApiDtos.stream().forEach(a -> {
                                ExchangeShareholder shareholder = BeanUtil.createShareholder(a);
                                shareholder.setId(UUID.randomUUID().toString().replace("-", ""));
                                shareholder.setLoanapplyid(personal.getId());
                                logger.info("保存股东信息编号：" + shareholder.getLoanapplyid());
                                shareholderMapper.insertSelective(shareholder);
                            });
                        }
                        //员工列表
                        List<LoanEmployeesApiDto> loanEmployeesApiDtos = dto.getLoanEmployeesApiDtos();
                        if (loanEmployeesApiDtos != null && loanEmployeesApiDtos.size() > 0) {
                            loanEmployeesApiDtos.stream().forEach(q -> {
                                ExchangeEmployee exchangeEmployee = BeanUtil.createEmployee(q);
                                exchangeEmployee.setId(UUID.randomUUID().toString().replace("-", ""));
                                exchangeEmployee.setLoanapplyid(personal.getId());
                                logger.info("保存员工信息编号：" + exchangeEmployee.getLoanapplyid());
                                exchangeEmployeeMapper.insertSelective(exchangeEmployee);
                            });
                        }
                    } else {
                        //获取失败
                        logger.info("获取就业局企业贷款申请详情接口失败，贷款申请编号为：" + polguaappDto.getApplyNo());
                        /**
                         * 添加错误日志到日志表
                         */
                        ErrorLog errorLog = new ErrorLog();
                        errorLog.setId(UUID.randomUUID().toString().replace("-", ""));
                        errorLog.setJyjInterface("2.4.9.4 企业贷款详细信息接口");
                        errorLog.setSendData(polguaappDto.getApplyNo());
                        errorLog.setResultData(res);
                        errorLogMapper.insert(errorLog);
                        return new JsonResult("获取就业贷款信息失败");}
                }
            } else {
                //修改对应的字段
                polguaapp.setExchangeType("TOXWD");
                polguaapp.setAuditresult(polguaappDto.getAutidResult());
                polguaapp.setApplyno(polguaappDto.getApplyNo());
                polguaapp.setAuditdate(polguaappDto.getAutidDate());
                polguaapp.setAuditadvice(polguaappDto.getRemark());
                polguaapp.setSourcetype(polguaappDto.getSourceType());
                try {
                    polguaappMapper.insertSelective(polguaapp);
                } catch (Exception e) {
                    e.printStackTrace();
                    return new JsonResult(e.getMessage());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(e.getMessage());
        }

        return new JsonResult();
    }

    //获取个人贷款申请详情
    private String getLoanApplyPersonal(String loanNo) {
        SerializeConfig serconfig = new SerializeConfig();
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "xwdbApi";
        String param2 = "loadPersonLoanDetailXwd";
        //获取就业系统码表接口
        String url = restUrl+"/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = Long.parseLong(loanNo);
        String jsonstr = JSON.toJSONString(params, serconfig);
        String result = InitAndRun.run(url, param1, param2, jsonstr);
        return result;
    }

    //获取企业贷款申请详情
    private String getLoanApplyCompany(String loanNo) {
        SerializeConfig serconfig = new SerializeConfig();
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "xwdbApi";
        String param2 = "loadCompanyLoanDetailXwd";
        //获取就业系统码表接口
        String url = restUrl+"/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = Long.parseLong(loanNo);
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        String result = InitAndRun.run(url, param1, param2, jsonstr);
        return result;
    }
}
