package com.cts.vo;

import org.springframework.stereotype.Component;

@Component
public class LoginVo {

	private Long loginId;

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

	public LoginVo(Long loginId, String name) {
		super();
		this.loginId = loginId;
		this.name = name;
	}

	public LoginVo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
