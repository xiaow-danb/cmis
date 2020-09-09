package com.wander.cmis.service.impl;

import com.wander.cmis.dao.UserInfoMapper;
import com.wander.cmis.entity.*;
import com.wander.cmis.mapper.ExchangeShareholderMapper;
import com.wander.cmis.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Resource
    private ExchangeCollateralinfoMapper exchangeCollateralinfoMapper;

    @Resource
    private ExchangeGuarantorinfoMapper exchangeGuarantorinfoMapper;

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Resource
    private ExchangeShareholderMapper exchangeShareholderMapper;

    @Override
    public String getUserInfoById(String uuid) {
//        return userInfoMapper.getUserName(uuid);
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(uuid);
        return userInfo.getUsername();
    }

    @Override
    public List<UserInfo> selectAllUserInfo() {
        return userInfoMapper.selectByExample(new UserInfoExample());
    }

    @Override
    public List<ExchangeCollateralinfo> getExchangeCollateralinfo() {
        return exchangeCollateralinfoMapper.selectByExample(new ExchangeCollateralinfoExample());
    }

    @Override
    public List<ExchangeGuarantorinfo> getExchangeGuarantorinfo() {
        return exchangeGuarantorinfoMapper.selectByExample(new ExchangeGuarantorinfoExample());
    }

    @Override
    public List<ExchangePolguaapp> getExchangePolguaapp() {
        return exchangePolguaappMapper.selectByExample(new ExchangePolguaappExample());
    }

    @Override
    public List<ExchangeShareholder> getExchangeShareholder() {
        return exchangeShareholderMapper.selectByExample(new ExchangeShareholderExample());
    }
}
