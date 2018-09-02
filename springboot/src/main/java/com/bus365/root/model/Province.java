package com.bus365.root.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="province")
public class Province implements Serializable {
	private static final long serialVersionUID = -822647586801978991L;
	@Id
	private Long code;
	private String name;
	private String provincecode;
	private Integer showorder;
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProvincecode() {
		return provincecode;
	}
	public void setProvincecode(String provincecode) {
		this.provincecode = provincecode;
	}
	public Integer getShoworder() {
		return showorder;
	}
	public void setShoworder(Integer showorder) {
		this.showorder = showorder;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Province [code=" + code + ", name=" + name + ", provincecode=" + provincecode + ", showorder="
				+ showorder + "]";
	}
	

}
