package com.hestudio.service;

import java.util.List;

import com.hestudio.model.User;

public interface UserService {
	User findUserByUserName(String username);
	List<User> findAllUsers();
	void updateUser(User user);
}
