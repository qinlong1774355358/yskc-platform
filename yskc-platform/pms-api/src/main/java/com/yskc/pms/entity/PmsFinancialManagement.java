package com.yskc.pms.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class PmsFinancialManagement implements Serializable {
    private Long id;

    private String userAccount;

    private BigDecimal accoutSumBalance;

    private BigDecimal accountWithdrawalBalance;

    private BigDecimal accountExpendSumBalance;

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

    public BigDecimal getAccoutSumBalance() {
        return accoutSumBalance;
    }

    public void setAccoutSumBalance(BigDecimal accoutSumBalance) {
        this.accoutSumBalance = accoutSumBalance;
    }

    public BigDecimal getAccountWithdrawalBalance() {
        return accountWithdrawalBalance;
    }

    public void setAccountWithdrawalBalance(BigDecimal accountWithdrawalBalance) {
        this.accountWithdrawalBalance = accountWithdrawalBalance;
    }

    public BigDecimal getAccountExpendSumBalance() {
        return accountExpendSumBalance;
    }

    public void setAccountExpendSumBalance(BigDecimal accountExpendSumBalance) {
        this.accountExpendSumBalance = accountExpendSumBalance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", accoutSumBalance=").append(accoutSumBalance);
        sb.append(", accountWithdrawalBalance=").append(accountWithdrawalBalance);
        sb.append(", accountExpendSumBalance=").append(accountExpendSumBalance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}