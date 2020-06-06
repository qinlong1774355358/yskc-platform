package com.yskc.pms.entity;

import java.io.Serializable;
import java.util.Date;

public class PmsRedPacket implements Serializable {
    private Long id;

    private String userAccount;

    private String serialNumber;

    private Integer redBagType;

    private Long redBagMoney;

    private Date efficaciousTime;

    private Date creationTime;

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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getRedBagType() {
        return redBagType;
    }

    public void setRedBagType(Integer redBagType) {
        this.redBagType = redBagType;
    }

    public Long getRedBagMoney() {
        return redBagMoney;
    }

    public void setRedBagMoney(Long redBagMoney) {
        this.redBagMoney = redBagMoney;
    }

    public Date getEfficaciousTime() {
        return efficaciousTime;
    }

    public void setEfficaciousTime(Date efficaciousTime) {
        this.efficaciousTime = efficaciousTime;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", redBagType=").append(redBagType);
        sb.append(", redBagMoney=").append(redBagMoney);
        sb.append(", efficaciousTime=").append(efficaciousTime);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}