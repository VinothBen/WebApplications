package com.cts.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.LoginDetails;
import com.cts.vo.LoginVo;

@Repository
public class MainDAOImpl implements MainDAO {

	private String name;
	@Autowired
	private SessionFactory sessionFactory;

	public String login(LoginVo loginVo) {

		Session s = sessionFactory.openSession();

		LoginDetails loginDetails = new LoginDetails();

		loginDetails.setLoginId(loginVo.getLoginId());
		loginDetails.setName(loginVo.getName());

		Transaction t = s.beginTransaction();

		try {
			s.saveOrUpdate(loginDetails);
			name = "Success!!";
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			name = e.getMessage();
		} finally {

			s.flush();
			s.close();
		}

		return name;
	}

}
