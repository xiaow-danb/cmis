package com.wander.cmis.service;

import com.wander.cmis.entity.UserInfo;
import com.wander.cmis.entity.UserInfoExample;

import java.util.List;

public interface UserInfoService {
    String getUserInfoById(String uuid);

    List<UserInfo> selectAllUserInfo();
}
