package com.bbs.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: Mr.Zhang
 * @Description:用户标签
 * @Date: 14:18 2019/2/25
 * @Modified By:
 */
@Entity
public class UserLabel implements Serializable {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name="id",strategy="assigned")
    private String id;
    @Column
    private String userId;
    @Column
    private String labelId;
    @Column
    private int flag;
    @Column
    private Timestamp createTime;
    @Column
    private Timestamp updateTime;
    @Transient
    private List<Label> labels;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
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

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }
}
