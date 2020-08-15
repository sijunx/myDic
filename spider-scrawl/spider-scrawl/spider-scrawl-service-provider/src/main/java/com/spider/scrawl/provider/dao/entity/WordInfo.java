package com.spider.scrawl.provider.dao.entity;

import java.util.Date;

public class WordInfo {
    private Long id;

    private String wordCnName;

    private String wordEnName;

    private Date createTime;

    private Long createUserId;

    private Date updateTime;

    private Long updateUserId;

    private Byte deleteFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWordCnName() {
        return wordCnName;
    }

    public void setWordCnName(String wordCnName) {
        this.wordCnName = wordCnName;
    }

    public String getWordEnName() {
        return wordEnName;
    }

    public void setWordEnName(String wordEnName) {
        this.wordEnName = wordEnName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}