package com.yskc.pms.entity;

import java.io.Serializable;

public class PmsWithdrawCheckManagement implements Serializable {
    private Long id;

    private String userAccount;

    private Long withdrawDepositSchedule;

    private String causeOfFailure;

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

    public Long getWithdrawDepositSchedule() {
        return withdrawDepositSchedule;
    }

    public void setWithdrawDepositSchedule(Long withdrawDepositSchedule) {
        this.withdrawDepositSchedule = withdrawDepositSchedule;
    }

    public String getCauseOfFailure() {
        return causeOfFailure;
    }

    public void setCauseOfFailure(String causeOfFailure) {
        this.causeOfFailure = causeOfFailure;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", withdrawDepositSchedule=").append(withdrawDepositSchedule);
        sb.append(", causeOfFailure=").append(causeOfFailure);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}