package com.wander.cmis.service.impl;

import com.wander.cmis.bean.LoanApiDto;
import com.wander.cmis.entity.ExchangeCollateralinfo;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.service.TransferService;
import com.wander.cmis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferServiceImpl implements TransferService {

    @Autowired
    private UserInfoService userInfoService;

    @Override
    public void doTransfer() {
        LoanApiDto loanApiDto = new LoanApiDto();
        List<ExchangePolguaapp> exchangePolguaapps = userInfoService.getExchangePolguaapp();
        exchangePolguaapps.stream().forEach(x -> {
            //业务经办信息
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
            List<ExchangeCollateralinfo> exchangeCollateralinfo = userInfoService.getExchangeCollateralinfo();

            //抵押质押信息列表
            //TODO bean次数据提交状态 没有取数逻辑
            loanApiDto.setCce099("");
        });
    }
}
