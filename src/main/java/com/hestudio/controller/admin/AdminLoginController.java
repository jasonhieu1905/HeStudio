package com.hestudio.controller.admin;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hestudio.model.User;
import com.hestudio.service.UserService;
import com.hestudio.utils.HashPassword;

@Controller
public class AdminLoginController {
	
	private static final String FAILED_LOGIN = "hestudio.login.failedlogin";
	
	@Autowired
	UserService userService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value="/admin/login",method = RequestMethod.GET)
	public String login(ModelMap model) {
		Locale.setDefault(Locale.ENGLISH);
		return "login";
	}
	
	@RequestMapping(value="/admin/login",method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("username")String username,@ModelAttribute("password")String password,ModelMap modelMap) {
		User user = userService.findUserByUserName(username);
		if(user != null){
			String hashedPassword = HashPassword.hashPassword(password);
			if(hashedPassword.equalsIgnoreCase(user.getPassword())){
				return "/admin/home";
			}
		}
		modelMap.addAttribute("error", messageSource.getMessage(FAILED_LOGIN, null,Locale.getDefault()));
		return "login";
	}
}
