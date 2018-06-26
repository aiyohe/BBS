package com.bbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Mr.Zhang
 * @Description: 用户管理
 * @Date: 11:27 2018/6/25
 * @Modified By:
 */
@Controller
public class UserController {
    private Logger log = LoggerFactory.getLogger(UserController.class);

    /**
     * 用户登录
     *
     * @return
     */
    @RequestMapping("")
    public String login() {
        log.info("--用户登录--");
        return "login";
    }

    @RequestMapping("/loginOut")
    public String loginOut() {
        log.info("--用户注销--");
        return "loginOut";
    }
}
