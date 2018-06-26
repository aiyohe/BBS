package com.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 11:08 2018/6/25
 * @Modified By:
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String helloWorld() {
        return "登录成功!";
    }
}
