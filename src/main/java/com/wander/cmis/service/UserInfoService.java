package com.wander.cmis.service;

import com.wander.cmis.entity.*;

import java.util.List;

public interface UserInfoService {
    String getUserInfoById(String uuid);

    List<UserInfo> selectAllUserInfo();

    /**
     * 获取抵质押物信息
     * @return
     */
    List<ExchangeCollateralinfo> getExchangeCollateralinfo();

    /**
     * 获取保证人信息
     * @return
     */
    List<ExchangeGuarantorinfo> getExchangeGuarantorinfo();

    /**
     * 小额贷款申请数据信息
     * @return
     */
    List<ExchangePolguaapp> getExchangePolguaapp();

    /**
     * 企业股东信息
     * @return
     */
    List<ExchangeShareholder> getExchangeShareholder();
}
