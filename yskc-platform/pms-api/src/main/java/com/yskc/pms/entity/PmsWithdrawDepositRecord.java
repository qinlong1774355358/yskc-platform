package com.yskc.pms.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsWithdrawDepositRecord implements Serializable {
    private Long id;

    private String userAccount;

    private BigDecimal withdrawDeposit;

    private Date withdrawTime;

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

    public BigDecimal getWithdrawDeposit() {
        return withdrawDeposit;
    }

    public void setWithdrawDeposit(BigDecimal withdrawDeposit) {
        this.withdrawDeposit = withdrawDeposit;
    }

    public Date getWithdrawTime() {
        return withdrawTime;
    }

    public void setWithdrawTime(Date withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", withdrawDeposit=").append(withdrawDeposit);
        sb.append(", withdrawTime=").append(withdrawTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}