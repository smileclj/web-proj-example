package com.wana.fruit.machine.model.entity;

import java.util.Date;

public class GameRecord {
    private String id;

    private Integer userId;

    private Integer betRate;

    private String betContent;

    private Integer betCoinTotal;

    private String method;

    private String result;

    private Integer gainCoinTotal;

    private Boolean isPrize;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBetRate() {
        return betRate;
    }

    public void setBetRate(Integer betRate) {
        this.betRate = betRate;
    }

    public String getBetContent() {
        return betContent;
    }

    public void setBetContent(String betContent) {
        this.betContent = betContent;
    }

    public Integer getBetCoinTotal() {
        return betCoinTotal;
    }

    public void setBetCoinTotal(Integer betCoinTotal) {
        this.betCoinTotal = betCoinTotal;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getGainCoinTotal() {
        return gainCoinTotal;
    }

    public void setGainCoinTotal(Integer gainCoinTotal) {
        this.gainCoinTotal = gainCoinTotal;
    }

    public Boolean getIsPrize() {
        return isPrize;
    }

    public void setIsPrize(Boolean isPrize) {
        this.isPrize = isPrize;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}