package com.saloni.user.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.saloni.user.dto.User;

public class UserDAOImplTest {
	
	@Test
	public void createShouldCreateProduct() {
		UserDAO dao=new UserDAOImpl();
		User user=new User();
		user.setId(1);
		user.setName("Person");
		user.setEmail("someone@example.com");
		dao.create(user);
		User result=dao.read(1);
		
		assertNotNull(result);
		assertEquals("Person",result.getName());
	}

}
