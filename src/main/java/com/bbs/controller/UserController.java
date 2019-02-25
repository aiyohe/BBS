package com.bbs.controller;

import com.bbs.entity.User;
import com.bbs.service.UserService;
import com.bbs.util.ConstantUtil;
import com.bbs.util.DateUtil;
import com.bbs.util.SequenceHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mr.Zhang
 * @Description: 用户管理
 * @Date: 11:27 2018/6/25
 * @Modified By:
 */
@Controller
@RequestMapping("/user")
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
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        User user=new User();
        user.setUserId(SequenceHelper.getUUID());
        user.setUserName("测试");
        user.setRealName("妞儿");
        user.setSex(ConstantUtil.UserSex.SEX_MEN);
        user.setFlag(ConstantUtil.Yxbj.FLAG_EFFECTIVE);
        user.setStatus(ConstantUtil.UserStatus.STATUS_EFFECTIVE);
        user.setCreateTime(DateUtil.getTimeStamp());
        userService.saveUser(user);
        return "sucess";
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
