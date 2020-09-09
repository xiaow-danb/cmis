package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.CommApiDTO;
import com.wander.cmis.bean.LoanApiDto;
import com.wander.cmis.bean.LoanJm65ApiDto;
import com.wander.cmis.bean.LoanJm66ApiDto;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.dao.CrmpersonalMapper;
import com.wander.cmis.entity.ExchangeCollateralinfo;
import com.wander.cmis.entity.ExchangeGuarantorinfo;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.service.TransferPersonalService;
import com.wander.cmis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class TransferPersonalServiceImpl implements TransferPersonalService {

    @Autowired
    private UserInfoService userInfoService;

    @Resource
    private CrmpersonalMapper crmpersonalMapper;

    @Override
    public void doTransfer() {
        List<ExchangePolguaapp> exchangePolguaapps = userInfoService.getExchangePolguaapp();
        exchangePolguaapps.stream().forEach(x -> {
            LoanApiDto loanApiDto = new LoanApiDto();
            //commApiDTO业务经办信息
            CommApiDTO commApiDTO = new CommApiDTO();
            //支撑平台办件编号
            commApiDTO.setHandlingno(UUID.randomUUID().toString());
            //渠道数据来源
            commApiDTO.setCaa999("50");
            loanApiDto.setCommApiDTO(commApiDTO);
            //借款人身份证号
            loanApiDto.setAac002(x.getCredentialno());
            //借款人姓名
            loanApiDto.setAac003(x.getClientname());
            //贷款申请日期
            loanApiDto.setTac002(x.getCreatetime());
            //申请人类型 cca130与cca080必填其一
            if (!StringUtils.isEmpty(x.getProposertype())) {
                loanApiDto.setCca080(x.getProposertype());
            } else {
                //人群类别 码值CAA130@1
                loanApiDto.setCaa130(x.getProposerbigtype());
            }
            //申请人证件类别 可以为空
            loanApiDto.setCaa135("");
            //申请人证件号 可以为空
            loanApiDto.setCaa136("");
            //是否21号文件最新人群   码值AAC081
            String text;
//            List<Is21CodeBean> aac081 = get21Code("AAC081");
            if (x.getIs21filepersonneltype()) {
//                for(Is21CodeBean is21CodeBean:aac081) {
//                    if(is21CodeBean.getText().equals("是")) {
//                        text =
//                    }
//                }
                text = "是";
            } else {
                text = "否";
            }
            loanApiDto.setCaa131(text);
            //就业局新增贷款方式字段
            loanApiDto.setTac125(x.getLoantype());
            //就业局新增确认免反担保人群类别
            loanApiDto.setCaa133(x.getQrmfdbrqlb());
            //就业局新增两无人员类别
            loanApiDto.setCaa129(x.getLwrylb());
            //婚姻状况
            loanApiDto.setCaa137(x.getMarrStatus());
            //是否以配偶执照贷款 --> 需要码值查询 可以为空 但取数逻辑待确认
            loanApiDto.setCaa126(x.getSfypozzdk());
            //配偶姓名
            loanApiDto.setTal003(x.getMarrownm());
            //配偶身份证号码
            loanApiDto.setTal002(x.getMarrowcredentialno());
            //配偶手机号码
            loanApiDto.setTal007(x.getMarrowphone());
            //配偶工作单位 --> 可以为空 但是没有
            loanApiDto.setTal008(x.getPogzdw());
            //家庭月收入(元)
            loanApiDto.setTac011(x.getIncomeofmonth());
            //法律(诉讼)文书送达地址 --> 正大那边没有
            loanApiDto.setCaa138(x.getFlwssddz());
            //统一社会信用代码
            loanApiDto.setTac017(x.getLicensenum());
            //就业局新增字段->个体工商户名称
            loanApiDto.setTac016(x.getGtgshmc());
            //经营项目
            loanApiDto.setTac018(x.getMainbusiintro());
            //经营地电话
            loanApiDto.setTac019(x.getPlaceofbusinessphone());
            //没有取数逻辑 经营地址
            loanApiDto.setTac013(x.getBusinessAddress());
            //是否小微企业
            loanApiDto.setTac010(x.getIsmircoenterprise());
            //营业执照注册时间
            loanApiDto.setTac121(x.getRegistdate());
            //税务登记号 -->非必须
            loanApiDto.setTac117(x.getLicensenum());
            //员工人数
            loanApiDto.setTac028(x.getEmployeenum());
            //本年新招人数
            loanApiDto.setTac012(x.getNewemployeenum());
            //贷款申请区县
            loanApiDto.setAaa027(x.getDomicile());
            //贷款申请街道
            loanApiDto.setAab301(x.getDksqjd());
            //贷款期限 -->文档中说明传固定值1
            loanApiDto.setCaa127("1");
            //创业担保金额(元)
            loanApiDto.setTac089(x.getCreatebusiamount());
            //没有取数逻辑-->组合商业贷款金额
            loanApiDto.setTac090(x.getZhsydkje());
            //申请贷款总金额(元)
            loanApiDto.setTac003(x.getLoanamount());
            //就业局新增意向银行
            loanApiDto.setXwdbankid(x.getYxyhbh());
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
            //本次数据提交状态
            loanApiDto.setCce099(x.getBcsjtjzt());

            /**
             * TODO 如果判断标识显示需要同步 项目调用同步的接口
             */
            doCqjyApi(loanApiDto);
        });
    }

    /**
     * 调用就业局的接口
     *
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
     *
     * @param exchangeCollateralinfo
     * @return
     */
    private List<LoanJm66ApiDto> collateralinfoTransfer(List<ExchangeCollateralinfo> exchangeCollateralinfo) {
        List<LoanJm66ApiDto> result = new ArrayList<>();
        exchangeCollateralinfo.stream().forEach(x -> {
            LoanJm66ApiDto loanJm66ApiDto = new LoanJm66ApiDto();
            //关联id
            loanJm66ApiDto.setLoanapplyId(x.getLoanapplyid());
            //权属人证件编码
            loanJm66ApiDto.setTad002(x.getQsrzjbm());
            //姓名
            loanJm66ApiDto.setTad003(x.getOwner());
            //手机号码
            loanJm66ApiDto.setTad008(x.getTelephone());
            //单位电话
            loanJm66ApiDto.setTad007(x.getUnitTel());
            //家庭住址
            loanJm66ApiDto.setTad005(x.getHomeAddr());
            //资产权属  需要去码值表中获取 码值TAD009
            loanJm66ApiDto.setTad009(x.getAssetownertype());
            //资产类别 需要去码值表中获取 码值TAD010
            loanJm66ApiDto.setTad010(x.getAssettype());
            //抵、质押品名称
            loanJm66ApiDto.setTad011(x.getMortgagename());
            //抵、质押品证号
            loanJm66ApiDto.setTad012(x.getWarrant());
            //抵、质押品估价
            loanJm66ApiDto.setTad013(x.getAssessvalue());
            //抵、质押品面积 资产类别为林权、宅基地、、居住性房地产、商业房地产、土地时，必填。
            loanJm66ApiDto.setTad014(new BigDecimal(x.getMortgagearea()));
            //土地属性 码值TAD015 需要去码表中获取
            loanJm66ApiDto.setTad015(x.getLandproperty());
            //购买价值（元）
            loanJm66ApiDto.setTad016(x.getBuyValue());
            //购买时间 TODO 时间能存BigDecimal?
            loanJm66ApiDto.setTad017(new BigDecimal(x.getBuydate()));
            //抵押物区域 码值TAD019 需要去码表中获取
            loanJm66ApiDto.setTad019(x.getCollateralarea());
            //所属乡镇街道
            loanJm66ApiDto.setTad021(x.getStreet());
            //抵押物详细地址
            loanJm66ApiDto.setTad018(x.getMortgageaddr());
            //档案附件ID
            loanJm66ApiDto.setRecordid(x.getDafjId());
            //担保人签字情况
            loanJm66ApiDto.setTad022(x.getDbrqzqk());
            result.add(loanJm66ApiDto);
        });
        return result;
    }

    /**
     * 保证人信息封装
     *
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
            //逾期偿还金额
            loanJm65ApiDto.setTab011(x.getYqchje());
            //现有负债(元)
            loanJm65ApiDto.setTab013(x.getXyfz());
            //供养人口
            loanJm65ApiDto.setTab013(x.getGyrk());
            //职务
            loanJm65ApiDto.setTab014(x.getDuty());
            //担保额度(元)
            loanJm65ApiDto.setTab018(x.getDeposit());
            //档案附件ID
            loanJm65ApiDto.setRecordid(x.getAdfjId());
            //担保人签字情况
            loanJm65ApiDto.setTab020(x.getDbrqzqk());
            result.add(loanJm65ApiDto);
        });
        return result;
    }
}
