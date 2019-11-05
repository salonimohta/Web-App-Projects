package com.saloni.user.bo;

import com.saloni.user.dto.User;

public interface UserBO {
	
	public void create(User u);
	
	public User findUser(int id);

}
