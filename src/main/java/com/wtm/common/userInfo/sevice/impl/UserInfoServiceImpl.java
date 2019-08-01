package com.wtm.common.userInfo.sevice.impl;

import com.wtm.common.userInfo.dao.UserInfoDao;
import com.wtm.common.userInfo.model.UserInfo;
import com.wtm.common.userInfo.sevice.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}