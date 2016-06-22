package com.hestudio.dao;

import java.util.List;

import com.hestudio.model.User;

public interface UserDAO {
	User getUserByUsername(String username);
	User getUserById(int id);
	List<User> getAllUsers();
	void updateUser(User user);
}
