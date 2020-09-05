package com.wander.cmis.service.impl;

import com.wander.cmis.dao.UserInfoMapper;
import com.wander.cmis.entity.UserInfo;
import com.wander.cmis.service.UserInfoService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

    @Reference
    private UserInfoMapper userInfoMapper;

    @Override
    public String getUserInfoById(String uuid) {
        return userInfoMapper.getUserName(uuid);
    }
}
