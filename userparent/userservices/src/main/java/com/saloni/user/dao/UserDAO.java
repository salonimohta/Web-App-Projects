package com.saloni.user.dao;

import com.saloni.user.dto.User;

public interface UserDAO {
	
	void create(User u);
	
	User read(int id);

}
