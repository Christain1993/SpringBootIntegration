package com.bus365.root.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users implements Serializable {
	
	private static final long serialVersionUID = -7366001677288250276L;
	@Id
	private Long id;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsernickname() {
		return usernickname;
	}
	public void setUsernickname(String usernickname) {
		this.usernickname = usernickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public Integer getCardtype() {
		return cardtype;
	}
	public void setCardtype(Integer cardtype) {
		this.cardtype = cardtype;
	}
	public String getIdnum() {
		return idnum;
	}
	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Long getAliasid() {
		return aliasid;
	}
	public void setAliasid(Long aliasid) {
		this.aliasid = aliasid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Integer getOccupation() {
		return occupation;
	}
	public void setOccupation(Integer occupation) {
		this.occupation = occupation;
	}
	public Integer getCheckway() {
		return checkway;
	}
	public void setCheckway(Integer checkway) {
		this.checkway = checkway;
	}
	public Integer getIsactive() {
		return isactive;
	}
	public void setIsactive(Integer isactive) {
		this.isactive = isactive;
	}
	public String getActivecode() {
		return activecode;
	}
	public void setActivecode(String activecode) {
		this.activecode = activecode;
	}
	public Long getLastpayid() {
		return lastpayid;
	}
	public void setLastpayid(Long lastpayid) {
		this.lastpayid = lastpayid;
	}
	public String getAkey() {
		return akey;
	}
	public void setAkey(String akey) {
		this.akey = akey;
	}
	public Integer getClienttype() {
		return clienttype;
	}
	public void setClienttype(Integer clienttype) {
		this.clienttype = clienttype;
	}
	public Integer getHighesteducation() {
		return highesteducation;
	}
	public void setHighesteducation(Integer highesteducation) {
		this.highesteducation = highesteducation;
	}
	public Integer getIslock() {
		return islock;
	}
	public void setIslock(Integer islock) {
		this.islock = islock;
	}
	public Integer getLoginerrortimes() {
		return loginerrortimes;
	}
	public void setLoginerrortimes(Integer loginerrortimes) {
		this.loginerrortimes = loginerrortimes;
	}
	public Timestamp getLastlogingtime() {
		return lastlogingtime;
	}
	public void setLastlogingtime(Timestamp lastlogingtime) {
		this.lastlogingtime = lastlogingtime;
	}
	public Double getCurmoney() {
		return curmoney;
	}
	public void setCurmoney(Double curmoney) {
		this.curmoney = curmoney;
	}
	public Double getVipintegral() {
		return vipintegral;
	}
	public void setVipintegral(Double vipintegral) {
		this.vipintegral = vipintegral;
	}
	public Double getVipexp() {
		return vipexp;
	}
	public void setVipexp(Double vipexp) {
		this.vipexp = vipexp;
	}
	public Integer getVipcreditvalue() {
		return vipcreditvalue;
	}
	public void setVipcreditvalue(Integer vipcreditvalue) {
		this.vipcreditvalue = vipcreditvalue;
	}
	public Timestamp getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public String getEmailactivekey() {
		return emailactivekey;
	}
	public void setEmailactivekey(String emailactivekey) {
		this.emailactivekey = emailactivekey;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String username;
	private String usernickname;
	private String password;
	private String phonenum;
	private String email;
	private String realname;
	private Integer cardtype;
	private String idnum;
	private Integer sex;
	private Date birthday;
	private String country;
	private String province;
	private String city;
	private String address;
	private String question;
	private Long aliasid;
	private String answer;
	private Integer occupation;// 所属行业
	private Integer checkway;
	private Integer isactive;
	private String activecode;
	private Long lastpayid;
	private String akey;
	private Integer clienttype;


	private Integer highesteducation;// 最高学历
	private Integer islock;
	private Integer loginerrortimes;
	private Timestamp lastlogingtime;
	private Double curmoney;
	private Double vipintegral;
	private Double vipexp;
	private Integer vipcreditvalue;
	private Timestamp updatetime;
	private Timestamp createtime;
	private String emailactivekey;
	private Integer status;
	

	
	
}
