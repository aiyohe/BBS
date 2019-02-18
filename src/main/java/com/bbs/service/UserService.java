package com.bbs.service;

import com.bbs.entity.User;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 11:27 2018/6/25
 * @Modified By:
 */
public interface UserService {
    /**
     * 保存用户信息
     *
     * @param user
     * @return
     */
    boolean saveUser(User user);
}
