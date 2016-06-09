package com.hestudio.rest.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hestudio.model.User;
import com.hestudio.service.UserService;

@RestController
public class AdminUserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/users",method = RequestMethod.GET)
	public ResponseEntity<Boolean> login(@RequestParam String username, @RequestParam String password){
		
		HttpHeaders httpHeaders = new HttpHeaders();	
		User loggedUser = userService.findUserByUserName(username);
		if(loggedUser!= null){
			return new ResponseEntity<Boolean>(true,httpHeaders,HttpStatus.OK);
		}
		return new ResponseEntity<Boolean>(false,httpHeaders,HttpStatus.OK);
	}
	
}
