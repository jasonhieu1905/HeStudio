package com.hestudio.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hestudio.dao.UserDAO;
import com.hestudio.model.User;

@Repository
public class UserDAOImpl extends AbstractDAOImpl implements UserDAO{

	public User getUserByUsername(String username) {
		@SuppressWarnings("unchecked")
		List<User> users = getSession().getNamedQuery("User.findByUsername").setParameter("username", username).list(); 
		if(users.size() != 0){
			return users.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		return getSession().getNamedQuery("User.findAll").list();
	}

	public void updateUser(User user) {
		getSession().update(user);
	}

}
