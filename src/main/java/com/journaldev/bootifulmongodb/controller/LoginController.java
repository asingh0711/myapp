package com.journaldev.bootifulmongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.journaldev.bootifulmongodb.dal.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	 @Autowired
	 LoginService loginService;
	 
	 @RequestMapping(value="/login", method = RequestMethod.GET)
	 public String showLoginPage(ModelMap model) {		 
		 return "login";
	 }
	
	
}
