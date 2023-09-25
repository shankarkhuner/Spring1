package com.cyber.success.CSJ30SpringBootMVCDemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	@RequestMapping("/hello")
public String displayLoginPage()
{
	return "login";
}
	
@RequestMapping(path="/login", method=RequestMethod.POST)
public String getLogin(@RequestParam("t1") String userName,@RequestParam("t2") String password, Model model) {
	
	if(userName.equalsIgnoreCase("admin") && password.equals("admin@123")) {
		
		model.addAttribute("adminKey", userName);
		return "admin";
	}
	else {
		
		return "errorPage";
	}
	
	
	
	
}




}
