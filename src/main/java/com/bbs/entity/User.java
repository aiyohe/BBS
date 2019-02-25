package com.bbs.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 11:25 2018/6/25
 * @Modified By:
 */
@Entity
public class User implements Serializable {
    @Id
   @GeneratedValue(generator = "user_id")
    @GenericGenerator(name="user_id",strategy="assigned")//此处strategy表示对应的生成方法 assigned赋值
    private String userId;
    @Column
    private String userName;
    @Column
    private String realName;
    @Column
    private String card;
    @Column
    private int sex;
    @Column
    private String birthday;
    @Column
    private String city;
    @Column
    private String address;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private String constellation;//星座
    @Column
    private String signature;//个性签名
    @Column
    private String avatar;//头像
    @Column
    private Timestamp createTime;
    @Column
    private Timestamp updateTime;
    @Column
    private String onlyPost;//帖子回复个性
    @Column
    private int status;//用户状态
    @Column
    private int flag;//用户有效性
    @Transient
    private UserLabel userLabel;//用户标签标签

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getOnlyPost() {
        return onlyPost;
    }

    public void setOnlyPost(String onlyPost) {
        this.onlyPost = onlyPost;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public UserLabel getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(UserLabel userLabel) {
        this.userLabel = userLabel;
    }
}
