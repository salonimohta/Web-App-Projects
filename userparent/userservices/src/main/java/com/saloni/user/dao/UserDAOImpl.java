package com.saloni.user.dao;

import java.util.HashMap;
import java.util.Map;

import com.saloni.user.dto.User;

public class UserDAOImpl implements UserDAO {

	Map<Integer,User> users = new HashMap<>();
	
	@Override
	public void create(User u) {
		users.put(u.getId(),u);
	}

	@Override
	public User read(int id) {
		return users.get(id);
	}

}
