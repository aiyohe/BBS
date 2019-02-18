package com.bbs.service.impl;

import com.bbs.dao.UserDao;
import com.bbs.entity.User;
import com.bbs.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 14:58 2018/6/26
 * @Modified By:
 */
@Component
public class UserServiceImpl implements UserService {
    private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
   //@Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean saveUser(User user) {

        return false;
    }
}
