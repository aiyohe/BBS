package com.bbs.controller;

import com.bbs.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mr.Zhang
 * @Description: 用户管理
 * @Date: 11:27 2018/6/25
 * @Modified By:
 */
@RestController
public class UserController {
    private Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    /**
     * 用户登录
     *
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        log.info("--用户登录--");
        return "login";
    }

    /**
     * 用户注销
     *
     * @return
     */
    @RequestMapping("/loginOut")
    public String loginOut() {
        log.info("--用户注销--");
        return "loginOut";
    }
}
