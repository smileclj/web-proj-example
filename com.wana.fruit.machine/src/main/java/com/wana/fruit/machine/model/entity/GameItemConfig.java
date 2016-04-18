package com.wana.fruit.machine.model.entity;

public class GameItemConfig {
    private Integer id;

    private String gameNo;

    private Integer no;

    private String name;

    private String icon;

    private Integer rate;

    private Boolean isShow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGameNo() {
        return gameNo;
    }

    public void setGameNo(String gameNo) {
        this.gameNo = gameNo;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
}