package com.hestudio.rest.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hestudio.model.User;
import com.hestudio.service.UserService;

@RestController
public class AdminUserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/users/",method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers(){
		List<User> users = userService.findAllUsers();
		if(users.isEmpty()){
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
}
