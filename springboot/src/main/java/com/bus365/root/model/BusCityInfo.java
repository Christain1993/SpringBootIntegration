package com.bus365.root.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 开通网上售票的出发城市信息
 *
 */
@Entity
@Table(name="buscityinfo")
public class BusCityInfo implements Serializable {
	private static final long serialVersionUID = 548391578696801003L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String citycode;
	public String findname;  //城市的名称
	public String find_jianpin;
	public String find_quanpin;
	public String province;
	public String cityname;
	public String remarks;
	public Integer istopcity;//0:非热门出发城市  1：热门出发城市
	public Integer flag;
	public Integer displayorder;
	public Long fathered;
	public String netname; // 所属服务器域名
	public String netaddress; // 所属服务器IP
	public String citynetname;//城市域名
	public Timestamp updatetime;
	public Timestamp createtime;
	public String provincecode;
	
}
