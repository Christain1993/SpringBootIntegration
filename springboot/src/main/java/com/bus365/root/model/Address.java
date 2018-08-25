package com.bus365.root.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String name;
	public String cityname;
	public String citycode;
	public String provincename;
	public String provincecode;
	public String completeaddress;
	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + ", cityname=" + cityname + ", citycode=" + citycode
				+ ", provincename=" + provincename + ", provincecode=" + provincecode + ", completeaddress="
				+ completeaddress + "]";
	}
	
}
