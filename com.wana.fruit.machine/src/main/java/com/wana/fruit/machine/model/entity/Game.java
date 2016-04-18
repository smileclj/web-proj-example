package com.wana.fruit.machine.model.entity;

import java.util.Date;

public class Game {
    private String no;

    private String name;

    private Integer signCoin;

    private Boolean isValid;

    private Date createTime;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSignCoin() {
        return signCoin;
    }

    public void setSignCoin(Integer signCoin) {
        this.signCoin = signCoin;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}