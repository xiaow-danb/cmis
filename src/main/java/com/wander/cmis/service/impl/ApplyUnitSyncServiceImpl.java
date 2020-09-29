package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.CommApiDTO;
import com.wander.cmis.bean.LoanApiDto;
import com.wander.cmis.bean.LoanEmployeesApiDto;
import com.wander.cmis.bean.UnitBaseInfoApiDTO;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.ErrorLog;
import com.wander.cmis.entity.ExchangeCounty;
import com.wander.cmis.entity.ExchangeEmployee;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.mapper.ErrorLogMapper;
import com.wander.cmis.mapper.ExchangeCountyMapper;
import com.wander.cmis.mapper.ExchangeEmployeeMapper;
import com.wander.cmis.mapper.ExchangePolguaappMapper;
import com.wander.cmis.service.ApplyUnitSyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;

@Service
@Transactional
public class ApplyUnitSyncServiceImpl implements ApplyUnitSyncService {

    Logger logger = LoggerFactory.getLogger(ApplyUnitSyncServiceImpl.class);

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Resource
    private ErrorLogMapper errorLogMapper;

    @Resource
    private ExchangeCountyMapper exchangeCountyMapper;

    @Resource
    private ExchangeEmployeeMapper exchangeEmployeeMapper;

    @Override
    public void doApplySync() {
        List<ExchangePolguaapp> exchangePolguaapps = exchangePolguaappMapper.test();
        List<Map<String, String>> list = new ArrayList<>();
        exchangePolguaapps.stream().forEach(x -> {
            Map<String, String> map = new HashMap<>();
            LoanApiDto loanApiDto = new LoanApiDto();
            //commApiDTO业务经办信息
            CommApiDTO commApiDTO = new CommApiDTO();
            //支撑平台办件编号
            commApiDTO.setHandlingno(UUID.randomUUID().toString().replace("-", ""));
            map.put("handlingno", commApiDTO.getHandlingno());
            //渠道数据来源
            commApiDTO.setCaa999("50");
            loanApiDto.setCommApiDTO(commApiDTO);
            //贷款单位编号 aab001 N 业务系统没有
            /**
             * 通过统一社会信用代码获取贷款单位编号
             */
            Long unitNo = getUnitNo(x.getLicensenum());
            if (StringUtils.isEmpty(unitNo)) {
                logger.error("单位编号获取失败---->Licensenum=" + x.getLicensenum());
            }
            loanApiDto.setAab001(unitNo);
            //企业名称 aab004   N
            loanApiDto.setAab004(x.getClientname());
            //统一社会信用代码 某些数据为空 aab003   N
            loanApiDto.setAab003(x.getLicensenum());
//            loanApiDto.setAab003("1235");
            //组织机构代码    tak002
            loanApiDto.setTak002(Optional.ofNullable(x.getEnterprisecode()).orElse(""));
            //TODO 所属行业  aab022  码值AAB022    N
            loanApiDto.setAab022("080000");
            //loanApiDto.setAab022("1");
            //是否小微企业    aab091  0否，1是
            loanApiDto.setAab091(x.getIsmircoenterprise());
            //微型企业类型    cca027  码值CCA027 业务系统提供不出来
            loanApiDto.setCca027(x.getMircoType());
            //法定代表人姓名   aab013  N
            loanApiDto.setAab013(x.getLegalnm());
            //法定代表人手机号  bae182  N
            loanApiDto.setBae182(Optional.ofNullable(x.getLegalcellphone()).orElse("1234"));
            //法人身份证号    aab014  N
            loanApiDto.setAab014(x.getLegalcredentialno());
            //法定代表人婚姻状  tak004  码值AAC017
            //法定代表人居住地址 tak005
            //基本户开户行 aae805
            loanApiDto.setAae805(Optional.ofNullable(x.getBasicbanknm()).orElse(""));
            //基本户户名 aae009
            //基本户账号 aae010
            loanApiDto.setAae010(Optional.ofNullable(x.getBasicbanknm()).orElse(""));
            //税务登记号->统一社会信用代码 tac117  N
            loanApiDto.setTac117(x.getLicensenum());
//            loanApiDto.setTac117("123");
            //工商营业执照号   tac017
            loanApiDto.setTac017(x.getLicensenum());
            //营业执照注册时间  tac121  yyyyMMdd格式
            loanApiDto.setTac121(x.getRegistdate());
            //贷款申请日期    tac002  yyyyMMdd格式  N
            loanApiDto.setTac002(x.getCreatetime());
            //创业担保贷款金额（元）   tac089  N
            loanApiDto.setTac089(x.getCreatebusiamount());
            //组合商业贷款金额（元）   tac090  N 跟业务部确认
            loanApiDto.setTac090(Optional.ofNullable(x.getGroupamount()).orElse(0D));
            //申请贷款总金额（元）    tac003  N
            loanApiDto.setTac003(x.getLoanamount());
            //贷款期限  caa127  传固定值1。  N
            loanApiDto.setCaa127("1");
            //意向银行    码值TAC079   N
            loanApiDto.setJm118id(Long.parseLong(x.getJm118id()));
            //年销售总额（元）  tac118
            //资产总额（元）   tac119
            loanApiDto.setTac119(x.getTotalassets() + "");
            //银行负债额 tac120
            loanApiDto.setTac120(x.getTotalbankliabilities() + "");
            //员工人数（不含申请人）   tac028  N
            loanApiDto.setTac028(x.getEmployeenum());
            //本年新招人数（不含申请人） tac012  N
            loanApiDto.setTac012(x.getNewemployeenum());
            //贷款用途  tac004
            //法律（诉讼）文书送达地址  caa138  N
            loanApiDto.setCaa138("法律（诉讼）文书送达地址");
            //贷款方式  tac125  码值TAC125    N  待正大完成映射关系
            ExchangeCounty exchangeCounty = exchangeCountyMapper.selectByPrimaryKey(x.getLoanway());
            loanApiDto.setTac125(exchangeCounty.getJyjcountyid());
            //免反担保人群类别  caa133  码值CAA133@2  贷款方式为免反担保时，必填。
            //两无人员类别    caa129  码值CAA129    贷款方式为两无人员时，必填。
            //贷款申请区县    aaa027  由地区查询接口获取   N
//            loanApiDto.setAaa027("500112");
            exchangeCounty = exchangeCountyMapper.selectByPrimaryKey(x.getDomicile());
            if (StringUtils.isEmpty(exchangeCounty)) {
                logger.error("获取的申请区县为空!!---->domicile=" + x.getDomicile());
            }
            loanApiDto.setAaa027(exchangeCounty.getJyjcountyid());
            //贷款申请街道/乡镇 aab301  由地区查询接口获取   N
//            loanApiDto.setAab301("50011208");
            exchangeCounty = exchangeCountyMapper.selectByPrimaryKey(x.getStreet());
            if (StringUtils.isEmpty(exchangeCounty)) {
                logger.error("获取贷款申请街道为空!!!---->street=" + x.getStreet());
            }
            loanApiDto.setAab301(exchangeCounty.getJyjcountyid());
            //股东列表  stockholderApiDtos
            //员工列表  loanEmployeesApiDtos    N
            List<ExchangeEmployee> exchangeEmployees = exchangeEmployeeMapper.selectByLoanId(x.getId());
            if (StringUtils.isEmpty(exchangeEmployees)) {
                logger.error("此ID获取的关联员工列表为空--->" + x.getId());
            }
            List<LoanEmployeesApiDto> loanEmployeesApiDtos = employeeTransfer(exchangeEmployees);
            loanApiDto.setLoanEmployeesApiDtos(loanEmployeesApiDtos);
            //担保人列表 jm65ApiDtos
            //抵押质押信息列表  jm66ApiDtos
            //本次数据提交状态  cce099  1001待反担保人签字；1002提交待审核   N
            loanApiDto.setCce099("1002");
            String s = doCqjyApi(loanApiDto);
            JSONObject parse = (JSONObject) JSONObject.parse(s);
            //推送返回成功 修改审核状态为已审核 推送是否推送就业局为已推送
            if ("200".equals(parse.getString("statusCode"))) {
                map.put("id", x.getId());
            } else {
                /**
                 * 添加错误日志到日志表
                 */
                ErrorLog errorLog = new ErrorLog();
                errorLog.setId(UUID.randomUUID().toString().replace("-", ""));
                errorLog.setJyjInterface("2.4.7.5 企业贷款申请数据提交接口");
                String send = JSONObject.toJSON(loanApiDto).toString();
                errorLog.setSendData(send);
                errorLog.setResultData(s);
                errorLogMapper.insert(errorLog);
            }
            list.add(map);
        });
        logger.info("成功的list中的id为---->" + list);
        System.out.println(Arrays.toString(list.toArray()));
        //成功的列表更改标识
        if (list.get(0).get("id") != null && !"".equals(list.get(0).get("id"))) {
            for (Map<String, String> map : list) {
                String handingNo = map.get("handlingno");
                String id = map.get("id");
                exchangePolguaappMapper.updateSuccess(handingNo, id);
            }
        }
    }

    /**
     * 根据统一社会信用代码获取单位编号
     *
     * @param licensenum
     * @return
     */
    private Long getUnitNo(String licensenum) {
        return loadUnitDetail(licensenum);
    }

    /**
     * 获取单位编号
     *
     * @param licensenum
     * @return
     */
    private Long loadUnitDetail(String licensenum) {
        SerializeConfig serconfig = new SerializeConfig();
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));
        String param1 = "unitBaseApi";
        String param2 = "loadUnitDetail";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        UnitBaseInfoApiDTO unitBaseInfoApiDTO = new UnitBaseInfoApiDTO();
        unitBaseInfoApiDTO.setAab003(licensenum);
        params[0] = unitBaseInfoApiDTO;
        String jsonstr = JSON.toJSONString(params, serconfig);
        String run = InitAndRun.run(url, param1, param2, jsonstr);
        JSONObject parse = (JSONObject) JSONObject.parse(run);
        String result = parse.getString("result");
        UnitBaseInfoApiDTO unitBaseInfoApiDTOs = JSONObject.parseObject(result, UnitBaseInfoApiDTO.class);
        return unitBaseInfoApiDTOs.getAab001();
    }

    private List<LoanEmployeesApiDto> employeeTransfer(List<ExchangeEmployee> exchangeEmployees) {
        List<LoanEmployeesApiDto> list = new ArrayList<>();
        exchangeEmployees.stream().forEach(x -> {
            LoanEmployeesApiDto loanEmployeesApiDto = new LoanEmployeesApiDto();
            //就业登记编号    acc002
            //人员编号  ccc001
            //身份证号  aac002
            loanEmployeesApiDto.setAac002(x.getIdno());
            //姓名    aac003
            loanEmployeesApiDto.setAac003(x.getName());
            //性别    aac004  码值AAC004
            //性别描述  aac004des
            //户口性质  aac009  码值AAC009
            //户口性质描述    aac009des
            //文化程度  aac011  码值AAC011
            //文化程度描述    aac011des
            //人员状态  aac016  码值AAC016
            //人员状态描述    aac016des
            //人员类别1 cca014  码值CCA014
            //人员类别1描述   cca014des
            //人员类别2 cca015  码值CCA014
            //人员类别2描述   cca015des
            //人员类别3  cca016   码值CCA014
            //人员类别3描述   cca016des
            //贷款人员类别    cca080  码值CCA080
            //贷款人员类别描述  cca080des
            list.add(loanEmployeesApiDto);
        });
        return list;
    }

    /**
     * 就业局企业贷款申请
     *
     * @param loanApiDto
     * @return
     */
    private String doCqjyApi(LoanApiDto loanApiDto) {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "loanManageApi";
        String param2 = "unitLoanSave";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = loanApiDto;
        String jsonstr = JSON.toJSONString(params, serconfig);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }
}
