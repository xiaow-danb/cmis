package com.wander.cmis.service.impl;

import com.wander.cmis.dao.UserInfoMapper;
import com.wander.cmis.entity.UserInfo;
import com.wander.cmis.entity.UserInfoExample;
import com.wander.cmis.service.UserInfoService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

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
}
