package com.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class demoController {
	
	@RequestMapping(value="/")
	public String demoPage(){
		return "home";
	}
	@RequestMapping(value="/welcome")
	public String welcomePage(){
		return "home";
	}
	
	@RequestMapping(value="/user**")
	public ModelAndView userPage(){
		ModelAndView  model = new ModelAndView();
		model.addObject("title","User's Account Page");
		model.addObject("message", "User's private section. Requires Authentication");
		model.setViewName("user");
		return model;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView loginPage(
			@RequestParam(value="error", required=false) String error,  
			@RequestParam(value="logout", required=false) String logout){
		
		ModelAndView model = new ModelAndView();
		if(error != null){
			model.addObject("error", "Invalid Username and Password");
		}
		if(logout != null){
			model.addObject("logout", "You have been logout successfully");
		}
		model.setViewName("login");
		return model;
		
	}
}
