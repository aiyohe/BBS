package com.bbs.entity;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author: Mr.Zhang
 * @Description:标签
 * @Date: 11:17 2019/2/25
 * @Modified By:
 */
@Entity
public class Label implements Serializable {
    @Id
    @GeneratedValue(generator = "label_id")
    @GenericGenerator(name="label_id",strategy="assigned")
    private String labelId;
    @Column
    private String userId;
    @Column
    private int labelType;//标签类别编号  如 中二  女装
    @Column
    private String labelTypeName;//标签类别名称
    private String parentLabelType;//上级标签
    @Column
    private String labelName;
    @Column
    private int flag;//有效性 0无效 1 有效
    @Column
    private Timestamp createTime;
    @Column
    private Timestamp updateTime;

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLabelType() {
        return labelType;
    }

    public void setLabelType(int labelType) {
        this.labelType = labelType;
    }

    public String getLabelTypeName() {
        return labelTypeName;
    }

    public void setLabelTypeName(String labelTypeName) {
        this.labelTypeName = labelTypeName;
    }

    public String getParentLabelType() {
        return parentLabelType;
    }

    public void setParentLabelType(String parentLabelType) {
        this.parentLabelType = parentLabelType;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
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
}
