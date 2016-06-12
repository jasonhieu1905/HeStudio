package com.hestudio.controller.admin;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hestudio.service.UserService;

@Controller
public class AdminHomeController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value="/admin/home",method = RequestMethod.GET)
	public String home(ModelMap model) {
		
		return "home";
	}
		
}
