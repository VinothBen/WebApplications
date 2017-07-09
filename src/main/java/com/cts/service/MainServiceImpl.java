package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.MainDAOImpl;
import com.cts.vo.LoginVo;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	private MainDAOImpl mainDAOImpl;
	
	public String login(LoginVo loginVo) {
		// TODO Auto-generated method stub
		String name = mainDAOImpl.login(loginVo);
		return name;
	}

}
