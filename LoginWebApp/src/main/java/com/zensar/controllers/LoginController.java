package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.entities.User;
import com.zensar.services.UserService;

/**
 * @author akansh_sai
 * @creation date 11th oct 2019 15:34pm
 * @version 1.0
 *
 */
//request processor component
@Controller
public class LoginController {
	@Autowired
	private UserService userService; 
	@RequestMapping("login")
	public String checkLogin(User user,ModelMap map) {
		if(userService.validateUser(user)) {
			map.addAttribute("usernm", user.getUsername());
			return "welcome";
		}
		else {
			map.addAttribute("loginerror","invalid username or password");
			return "login";
		}
		
		
	}
}
