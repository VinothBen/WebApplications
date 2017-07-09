package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login_details")
public class LoginDetails {

	@Id
	@Column
	private Long loginId;
	@Column
	private String name;

	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LoginDetails(Long loginId, String name) {
		super();
		this.loginId = loginId;
		this.name = name;
	}

	public LoginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
}
