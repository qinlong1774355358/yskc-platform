package com.yskc.pms.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsSupportRecord implements Serializable {
    private Long id;

    private String userAccount;

    private BigDecimal supportBalance;

    private Date supportTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public BigDecimal getSupportBalance() {
        return supportBalance;
    }

    public void setSupportBalance(BigDecimal supportBalance) {
        this.supportBalance = supportBalance;
    }

    public Date getSupportTime() {
        return supportTime;
    }

    public void setSupportTime(Date supportTime) {
        this.supportTime = supportTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", supportBalance=").append(supportBalance);
        sb.append(", supportTime=").append(supportTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}