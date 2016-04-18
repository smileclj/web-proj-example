package com.wana.fruit.machine.model.dto.token.resp;

import java.util.Date;
import java.util.List;

public class UserInfoRespDto {
	private Integer id;
	private Double amounts;
	private String city;
	private Integer coins;
	private String country;
	private Date createTime;
	private Date lastLoginTime;
	private String mobile;
	private String nickname;
	private String province;
	private Integer sex;
	private String paymentpwd;
	private String usertype;
	private String realname;
	private String idcard;
	private String state;
	private Integer empiricalvalue;
	private Integer vipempiricalvalue;
	private Integer diamond;
	private Boolean visible;
	private String sign;
	private String headimgurl;
	private List<Integer> friends;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getAmounts() {
		return amounts;
	}

	public void setAmounts(Double amounts) {
		this.amounts = amounts;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getCoins() {
		return coins;
	}

	public void setCoins(Integer coins) {
		this.coins = coins;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPaymentpwd() {
		return paymentpwd;
	}

	public void setPaymentpwd(String paymentpwd) {
		this.paymentpwd = paymentpwd;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getEmpiricalvalue() {
		return empiricalvalue;
	}

	public void setEmpiricalvalue(Integer empiricalvalue) {
		this.empiricalvalue = empiricalvalue;
	}

	public Integer getVipempiricalvalue() {
		return vipempiricalvalue;
	}

	public void setVipempiricalvalue(Integer vipempiricalvalue) {
		this.vipempiricalvalue = vipempiricalvalue;
	}

	public Integer getDiamond() {
		return diamond;
	}

	public void setDiamond(Integer diamond) {
		this.diamond = diamond;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public List<Integer> getFriends() {
		return friends;
	}

	public void setFriends(List<Integer> friends) {
		this.friends = friends;
	}

}
