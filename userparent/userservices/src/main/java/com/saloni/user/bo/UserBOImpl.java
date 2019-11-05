package com.saloni.user.bo;

import com.saloni.user.dao.UserDAO;
import com.saloni.user.dto.User;

public class UserBOImpl implements UserBO {

	private UserDAO dao;
	@Override
	public void create(User u) {
		dao.create(u);
	}

	@Override
	public User findUser(int id) {
		return dao.read(id);
	}

	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

}
