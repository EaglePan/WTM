package com.wtm.common.userInfo.sevice;

import com.wtm.common.userInfo.model.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}