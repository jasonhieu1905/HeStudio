package com.hestudio.rest.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hestudio.model.User;
import com.hestudio.service.UserService;
import com.hestudio.utils.HashPassword;

@RestController
public class AdminUserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/users",method = RequestMethod.POST)
	public ResponseEntity<User> login(@RequestParam String username, @RequestParam String password){
		
		HttpHeaders httpHeaders = new HttpHeaders();	
		User loggedUser = userService.findUserByUserName(username);
		String hashedFromInput = HashPassword.hashPassword(password);
		if(loggedUser!= null){
			if(loggedUser.getPassword().equalsIgnoreCase(hashedFromInput)){
				return new ResponseEntity<User>(loggedUser,httpHeaders,HttpStatus.OK);
			}
		}
		return new ResponseEntity<User>(null,httpHeaders,HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/updateAdminAccount",method = RequestMethod.POST)
	public ResponseEntity<User> login(@ModelAttribute User user){
		
		HttpHeaders httpHeaders = new HttpHeaders();	
		User loggedUser = userService.getUserById(user.getId());
		String newHashPassword = HashPassword.hashPassword(user.getPassword());
		loggedUser.setUsername(user.getUsername());
		loggedUser.setPassword(newHashPassword);
		try{
			userService.updateUser(loggedUser);
			return new ResponseEntity<User>(loggedUser,httpHeaders,HttpStatus.OK);
		}catch(Exception ex){
			System.out.println("Problem while updating admin account" + ex.getMessage());
			return new ResponseEntity<User>(null,httpHeaders,HttpStatus.OK);
		}
		
	}
	
}
