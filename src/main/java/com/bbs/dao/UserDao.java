package com.bbs.dao;

import com.bbs.entity.User;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 11:27 2018/6/25
 * @Modified By:
 */
public interface UserDao extends JpaRepository<User,String> {
   Optional<User> findById(String userId);

}
