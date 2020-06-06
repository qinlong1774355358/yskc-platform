package com.yskc.pms.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class PmsGetRedPackage implements Serializable {
    private Long id;

    private String userAccount;

    private String redPackageNumber;

    private Integer redPackageTotal;

    private Integer redPackageResidue;

    private BigDecimal redPackageTotalMoney;

    private Integer remainingTime;

    private BigDecimal remainingBalance;

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

    public String getRedPackageNumber() {
        return redPackageNumber;
    }

    public void setRedPackageNumber(String redPackageNumber) {
        this.redPackageNumber = redPackageNumber;
    }

    public Integer getRedPackageTotal() {
        return redPackageTotal;
    }

    public void setRedPackageTotal(Integer redPackageTotal) {
        this.redPackageTotal = redPackageTotal;
    }

    public Integer getRedPackageResidue() {
        return redPackageResidue;
    }

    public void setRedPackageResidue(Integer redPackageResidue) {
        this.redPackageResidue = redPackageResidue;
    }

    public BigDecimal getRedPackageTotalMoney() {
        return redPackageTotalMoney;
    }

    public void setRedPackageTotalMoney(BigDecimal redPackageTotalMoney) {
        this.redPackageTotalMoney = redPackageTotalMoney;
    }

    public Integer getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(Integer remainingTime) {
        this.remainingTime = remainingTime;
    }

    public BigDecimal getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(BigDecimal remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", redPackageNumber=").append(redPackageNumber);
        sb.append(", redPackageTotal=").append(redPackageTotal);
        sb.append(", redPackageResidue=").append(redPackageResidue);
        sb.append(", redPackageTotalMoney=").append(redPackageTotalMoney);
        sb.append(", remainingTime=").append(remainingTime);
        sb.append(", remainingBalance=").append(remainingBalance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}