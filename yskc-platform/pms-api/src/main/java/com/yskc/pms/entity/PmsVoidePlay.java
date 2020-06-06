package com.yskc.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class PmsVoidePlay implements Serializable {
    private Long id;

    private String userAccount;

    private String videoContent;

    private String videoCheckSchedule;

    private String videoCheckDefeatedCause;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date applyCheckTime;

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

    public String getVideoContent() {
        return videoContent;
    }

    public void setVideoContent(String videoContent) {
        this.videoContent = videoContent;
    }

    public String getVideoCheckSchedule() {
        return videoCheckSchedule;
    }

    public void setVideoCheckSchedule(String videoCheckSchedule) {
        this.videoCheckSchedule = videoCheckSchedule;
    }

    public String getVideoCheckDefeatedCause() {
        return videoCheckDefeatedCause;
    }

    public void setVideoCheckDefeatedCause(String videoCheckDefeatedCause) {
        this.videoCheckDefeatedCause = videoCheckDefeatedCause;
    }

    public Date getApplyCheckTime() {
        return applyCheckTime;
    }

    public void setApplyCheckTime(Date applyCheckTime) {
        this.applyCheckTime = applyCheckTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", videoContent=").append(videoContent);
        sb.append(", videoCheckSchedule=").append(videoCheckSchedule);
        sb.append(", videoCheckDefeatedCause=").append(videoCheckDefeatedCause);
        sb.append(", applyCheckTime=").append(applyCheckTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}