package com.hestudio.dao;

import java.util.List;

import com.hestudio.model.User;

public interface UserDAO {
	User getUserByUsername(String username);
	List<User> getAllUsers();
}
