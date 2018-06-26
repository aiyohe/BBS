package com.bbs.service.impl;

import com.bbs.dao.UserDao;
import com.bbs.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 14:58 2018/6/26
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {
    private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
