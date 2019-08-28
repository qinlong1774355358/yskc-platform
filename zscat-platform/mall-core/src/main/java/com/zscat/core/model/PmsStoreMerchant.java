package com.zscat.core.model;

import java.io.Serializable;
import java.util.Date;

public class PmsStoreMerchant implements Serializable {
    private Integer id;

    private String name;

    private String address;

    private String picture;

    private String license;

    private String licenseNo;

    private String identityCardFront;

    private String identityCardContrary;

    private String identityCardPhoto;

    private String identityCard;

    private String relationPhone;

    private String standbyPhone;

    private String wechatId;

    private String bankCardPhoto;

    private String bankCard;

    private Integer state;

    private Integer evaluateState;

    private Integer storeClassifyId;

    private Double longitude;

    private Double latitude;

    private String intro;

    private Integer createBy;

    private Date createDate;

    private Integer updateBy;

    private Date updateDate;

    private Integer remarks;

    private Integer enable;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo == null ? null : licenseNo.trim();
    }

    public String getIdentityCardFront() {
        return identityCardFront;
    }

    public void setIdentityCardFront(String identityCardFront) {
        this.identityCardFront = identityCardFront == null ? null : identityCardFront.trim();
    }

    public String getIdentityCardContrary() {
        return identityCardContrary;
    }

    public void setIdentityCardContrary(String identityCardContrary) {
        this.identityCardContrary = identityCardContrary == null ? null : identityCardContrary.trim();
    }

    public String getIdentityCardPhoto() {
        return identityCardPhoto;
    }

    public void setIdentityCardPhoto(String identityCardPhoto) {
        this.identityCardPhoto = identityCardPhoto == null ? null : identityCardPhoto.trim();
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard == null ? null : identityCard.trim();
    }

    public String getRelationPhone() {
        return relationPhone;
    }

    public void setRelationPhone(String relationPhone) {
        this.relationPhone = relationPhone == null ? null : relationPhone.trim();
    }

    public String getStandbyPhone() {
        return standbyPhone;
    }

    public void setStandbyPhone(String standbyPhone) {
        this.standbyPhone = standbyPhone == null ? null : standbyPhone.trim();
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }

    public String getBankCardPhoto() {
        return bankCardPhoto;
    }

    public void setBankCardPhoto(String bankCardPhoto) {
        this.bankCardPhoto = bankCardPhoto == null ? null : bankCardPhoto.trim();
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getEvaluateState() {
        return evaluateState;
    }

    public void setEvaluateState(Integer evaluateState) {
        this.evaluateState = evaluateState;
    }

    public Integer getStoreClassifyId() {
        return storeClassifyId;
    }

    public void setStoreClassifyId(Integer storeClassifyId) {
        this.storeClassifyId = storeClassifyId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getRemarks() {
        return remarks;
    }

    public void setRemarks(Integer remarks) {
        this.remarks = remarks;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", address=").append(address);
        sb.append(", picture=").append(picture);
        sb.append(", license=").append(license);
        sb.append(", licenseNo=").append(licenseNo);
        sb.append(", identityCardFront=").append(identityCardFront);
        sb.append(", identityCardContrary=").append(identityCardContrary);
        sb.append(", identityCardPhoto=").append(identityCardPhoto);
        sb.append(", identityCard=").append(identityCard);
        sb.append(", relationPhone=").append(relationPhone);
        sb.append(", standbyPhone=").append(standbyPhone);
        sb.append(", wechatId=").append(wechatId);
        sb.append(", bankCardPhoto=").append(bankCardPhoto);
        sb.append(", bankCard=").append(bankCard);
        sb.append(", state=").append(state);
        sb.append(", evaluateState=").append(evaluateState);
        sb.append(", storeClassifyId=").append(storeClassifyId);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", intro=").append(intro);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", remarks=").append(remarks);
        sb.append(", enable=").append(enable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}