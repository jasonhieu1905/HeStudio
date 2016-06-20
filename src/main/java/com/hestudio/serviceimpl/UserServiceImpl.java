package com.hestudio.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hestudio.dao.UserDAO;
import com.hestudio.model.User;
import com.hestudio.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public User findUserByUserName(String username) {
		return userDAO.getUserByUsername(username);
	}

	public List<User> findAllUsers() {
		return userDAO.getAllUsers();
	}

	public void updateUser(User user) {
		userDAO.updateUser(user);
	}

}
