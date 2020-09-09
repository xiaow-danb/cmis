package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.LoanApiDto;
import com.wander.cmis.bean.LoanJm65ApiDto;
import com.wander.cmis.bean.LoanJm66ApiDto;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.ExchangeCollateralinfo;
import com.wander.cmis.entity.ExchangeGuarantorinfo;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.service.TransferPersonalService;
import com.wander.cmis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TransferPersonalServiceImpl implements TransferPersonalService {

    @Autowired
    private UserInfoService userInfoService;

    @Override
    public void doTransfer() {
        List<ExchangePolguaapp> exchangePolguaapps = userInfoService.getExchangePolguaapp();
        exchangePolguaapps.stream().forEach(x -> {
            LoanApiDto loanApiDto = new LoanApiDto();
            //TODO 业务经办信息 -->所有字段都没有

            //借款人身份证号
            loanApiDto.setAac002(x.getCredentialno());
            //借款人姓名
            loanApiDto.setAac003(x.getClientname());
            //贷款申请日期
            loanApiDto.setTac002(x.getCreatetime());
            //TODO 申请人类型 --> 需要一个码值去查询
            loanApiDto.setCca080(x.getProposertype());
            //申请人证件类别 可以为空
            //loanApiDto.setCaa135();
            //申请人证件号
            //loanApiDto.setCaa136(setCaa136);
            //TODO 是否21号文件最新人群-->需要一个码表值去查询码表
            loanApiDto.setCaa131(x.getPersonneltype21file());
            //TODO 人群类别 --> 需要一个码值去查询码表  码值和人群类别都没有 可以为空
//            loanApiDto.setCaa130();
            //TODO 就业局新增贷款方式字段
            loanApiDto.setTac125("");
            //TODO 就业局新增确认免反担保人群类别
            loanApiDto.setCaa133("");
            //TODO 就业局新增两无人员类别
            loanApiDto.setCaa129("");
            //TODO 婚姻状况 就业局新增字段 并且需要码值查询 取数逻辑待确认
            loanApiDto.setCaa137("");
            //TODO 是否以配偶执照贷款 --> 需要码值查询 可以为空 但取数逻辑待确认
            loanApiDto.setCaa126("");
            //配偶姓名
            loanApiDto.setTal003(x.getMarrownm());
            //配偶身份证号码
            loanApiDto.setTal002(x.getMarrowcredentialno());
            //配偶手机号码
            loanApiDto.setTal007(x.getMarrowphone());
            //TODO 配偶工作单位 --> 可以为空 但是没有
            loanApiDto.setTal008("");
            //家庭月收入(元)
            loanApiDto.setTac011(x.getIncomeofmonth());
            //TODO 法律(诉讼)文书送达地址 --> 正大那边没有 取数逻辑待确认
            loanApiDto.setCaa138("");
            //统一社会信用代码
            loanApiDto.setTac017(x.getLicensenum());
            //TODO 就业局新增字段->个体工商户名称
            loanApiDto.setTac016("");
            //经营项目
            loanApiDto.setTac018(x.getMainbusiintro());
            //经营地电话
            loanApiDto.setTac019(x.getPlaceofbusinessphone());
            //TODO 没有取数逻辑 经营地址
            loanApiDto.setTac013("");
            //是否小微企业
            loanApiDto.setTac010(x.getIsmircoenterprise());
            //营业执照注册时间
            loanApiDto.setTac121(x.getRegistdate());
            //TODO 税务登记号 -->非必须 但没有
            loanApiDto.setTac117("");
            //员工人数
            loanApiDto.setTac028(x.getEmployeenum());
            //本年新招人数
            loanApiDto.setTac012(x.getNewemployeenum());
            //贷款申请区县
            loanApiDto.setAaa027(x.getDomicile());
            //TODO 贷款申请街道 没有取数逻辑
            loanApiDto.setAab301("");
            //贷款期限 -->文档中说明传固定值1
            loanApiDto.setCaa127("1");
            //创业担保金额(元)
            loanApiDto.setTac089(x.getCreatebusiamount());
            //TODO 没有取数逻辑-->组合商业贷款金额
            loanApiDto.setTac090(new BigDecimal("1"));
            //申请贷款总金额(元)
            loanApiDto.setTac003(x.getLoanamount());
            //TODO 就业局新增意向银行
            loanApiDto.setXwdbankid("");
            //担保人列表
            List<ExchangeGuarantorinfo> exchangeGuarantorinfo = userInfoService.getExchangeGuarantorinfo();
            List<LoanJm65ApiDto> guarantorinfoList = guarantorinfoTransfer(exchangeGuarantorinfo);
            Map<String, List<LoanJm65ApiDto>> loanJm65ApiDtoMap =
                    guarantorinfoList.stream().collect(Collectors.groupingBy(LoanJm65ApiDto::getLoanapplyId));
            loanApiDto.setJm65ApiDtos(loanJm65ApiDtoMap.get(x.getId()));
            //抵押质押信息列表
            List<ExchangeCollateralinfo> exchangeCollateralinfo = userInfoService.getExchangeCollateralinfo();
            List<LoanJm66ApiDto> collateralinfoList = collateralinfoTransfer(exchangeCollateralinfo);
            Map<String, List<LoanJm66ApiDto>> loanJm66ApiDtoMap =
                    collateralinfoList.stream().collect(Collectors.groupingBy(LoanJm66ApiDto::getLoanapplyId));
            loanApiDto.setJm66ApiDtos(loanJm66ApiDtoMap.get(x.getId()));
            //TODO 本次数据提交状态 没有取数逻辑
            loanApiDto.setCce099("");

            /**
             * TODO 如果判断标识显示需要同步 项目调用同步的接口
             */
            doCqjyApi(loanApiDto);
        });
    }

    /**
     * 调用就业局的接口
     * @param loanApiDto
     */
    private void doCqjyApi(LoanApiDto loanApiDto) {

        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "loanManageApi";
        String param2 = "personLoanSave";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = loanApiDto;
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        InitAndRun.run(url, param1, param2, jsonstr);

    }

    /**
     * 抵押信息封装
     * @param exchangeCollateralinfo
     * @return
     */
    private List<LoanJm66ApiDto> collateralinfoTransfer(List<ExchangeCollateralinfo> exchangeCollateralinfo) {
        List<LoanJm66ApiDto> result = new ArrayList<>();
        exchangeCollateralinfo.stream().forEach(x -> {
            LoanJm66ApiDto loanJm66ApiDto = new LoanJm66ApiDto();
            //关联id
            loanJm66ApiDto.setLoanapplyId(x.getLoanapplyid());
            //TODO 权属人证件编码 没有取数逻辑
            loanJm66ApiDto.setTad002("");
            //姓名
            loanJm66ApiDto.setTad003(x.getOwner());
            //TODO 手机号码 没有取数逻辑
            loanJm66ApiDto.setTad008("");
            //TODO 单位电话 没有取数逻辑
            loanJm66ApiDto.setTad007("");
            //TODO 家庭住址 没有取数逻辑
            loanJm66ApiDto.setTad005("");
            //资产权属 TODO 需要去码值表中获取 码值TAD009
            loanJm66ApiDto.setTad009(x.getAssetownertype());
            //资产类别 TODO 需要去码值表中获取 码值TAD010
            loanJm66ApiDto.setTad010(x.getAssettype());
            //抵、质押品名称
            loanJm66ApiDto.setTad011(x.getMortgagename());
            //抵、质押品证号
            loanJm66ApiDto.setTad012(x.getWarrant());
            //抵、质押品估价
            loanJm66ApiDto.setTad013(x.getAssessvalue());
            //抵、质押品面积 资产类别为林权、宅基地、、居住性房地产、商业房地产、土地时，必填。
            loanJm66ApiDto.setTad014(new BigDecimal(x.getMortgagearea()));
            //土地属性 码值TAD015 TODO 需要去码表中获取
            loanJm66ApiDto.setTad015(x.getLandproperty());
            //TODO 没有取数逻辑 购买价值（元）
            loanJm66ApiDto.setTad016(new BigDecimal("1"));
            //购买时间 TODO 时间能存BigDecimal?
            loanJm66ApiDto.setTad017(new BigDecimal(x.getBuydate()));
            //抵押物区域 码值TAD019 TODO 需要去码表中获取
            loanJm66ApiDto.setTad019(x.getCollateralarea());
            //所属乡镇街道
            loanJm66ApiDto.setTad021(x.getStreet());
            //抵押物详细地址
            loanJm66ApiDto.setTad018(x.getMortgageaddr());
            //档案附件ID TODO 取数逻辑
            loanJm66ApiDto.setRecordid("");
            //担保人签字情况 TODO 取数逻辑
            loanJm66ApiDto.setTad022("");
            result.add(loanJm66ApiDto);
        });
        return result;
    }

    /**
     * 保证人信息封装
     * @param exchangeGuarantorinfo
     * @return
     */
    private List<LoanJm65ApiDto> guarantorinfoTransfer(List<ExchangeGuarantorinfo> exchangeGuarantorinfo) {
        List<LoanJm65ApiDto> result = new ArrayList<>();
        exchangeGuarantorinfo.stream().forEach(x -> {
            LoanJm65ApiDto loanJm65ApiDto = new LoanJm65ApiDto();
            //关联id
            loanJm65ApiDto.setLoanapplyId(x.getLoanapplyid());
            //证件号码
            loanJm65ApiDto.setTab002(x.getIdno());
            //姓名
            loanJm65ApiDto.setTab003(x.getGuarantor());
            //手机号码
            loanJm65ApiDto.setTab016(x.getContactway());
            //家庭住址
            loanJm65ApiDto.setTab005(x.getAddress());
            //担保人类型
            loanJm65ApiDto.setTab007(x.getWorkunittype());
            //工作单位
            loanJm65ApiDto.setTab008(x.getGuarantorworkunit());
            //单位电话
            loanJm65ApiDto.setTab015(x.getGuarantorunitphone());
            //年收入(元)
            loanJm65ApiDto.setTab009(x.getMonthlyincome());
            //TODO 没有取数逻辑-->逾期偿还金额
            loanJm65ApiDto.setTab011(new BigDecimal("1"));
            //TODO 没有取数逻辑-->现有负债(元)
            loanJm65ApiDto.setTab013(new BigDecimal("1"));
            //TODO 没有取数逻辑-->供养人口
            loanJm65ApiDto.setTab013(new BigDecimal("1"));
            //职务
            loanJm65ApiDto.setTab014(x.getDuty());
            //担保额度(元)
            loanJm65ApiDto.setTab018(x.getDeposit());
            //TODO 没有取数逻辑 可以不传
            loanJm65ApiDto.setRecordid("");
            //TODO 担保人签字情况 没有取数逻辑
            loanJm65ApiDto.setTab020("");
            result.add(loanJm65ApiDto);
        });
        return result;
    }
}
