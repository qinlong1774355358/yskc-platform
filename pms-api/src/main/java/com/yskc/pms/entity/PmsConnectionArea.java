package com.yskc.pms.entity;

import java.io.Serializable;
import java.util.Date;

public class PmsConnectionArea implements Serializable {
    private Integer id;

    private String userAccount;

    private Byte illegal;

    private String illegalContext;

    private Integer illegalCount;

    private Byte operation;

    private String operator;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Byte getIllegal() {
        return illegal;
    }

    public void setIllegal(Byte illegal) {
        this.illegal = illegal;
    }

    public String getIllegalContext() {
        return illegalContext;
    }

    public void setIllegalContext(String illegalContext) {
        this.illegalContext = illegalContext;
    }

    public Integer getIllegalCount() {
        return illegalCount;
    }

    public void setIllegalCount(Integer illegalCount) {
        this.illegalCount = illegalCount;
    }

    public Byte getOperation() {
        return operation;
    }

    public void setOperation(Byte operation) {
        this.operation = operation;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", illegal=").append(illegal);
        sb.append(", illegalContext=").append(illegalContext);
        sb.append(", illegalCount=").append(illegalCount);
        sb.append(", operation=").append(operation);
        sb.append(", operator=").append(operator);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}