package com.yskc.pms.entity;

import java.io.Serializable;

public class Pmslogin implements Serializable {
    private Integer id;

    private Integer type;

    private String sign;

    private String account;

    private Integer accounttype;

    private String token;

    private String password;

    private Integer loginmethod;

    private Integer pmsAdminId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(Integer accounttype) {
        this.accounttype = accounttype;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLoginmethod() {
        return loginmethod;
    }

    public void setLoginmethod(Integer loginmethod) {
        this.loginmethod = loginmethod;
    }

    public Integer getPmsAdminId() {
        return pmsAdminId;
    }

    public void setPmsAdminId(Integer pmsAdminId) {
        this.pmsAdminId = pmsAdminId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", sign=").append(sign);
        sb.append(", account=").append(account);
        sb.append(", accounttype=").append(accounttype);
        sb.append(", token=").append(token);
        sb.append(", password=").append(password);
        sb.append(", loginmethod=").append(loginmethod);
        sb.append(", pmsAdminId=").append(pmsAdminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}