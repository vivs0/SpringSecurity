package com.springSecurity.Controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class demoController {
	
	@RequestMapping(value="/")
	public ModelAndView welcomePage(){
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Exmaple Using Annotation");
		model.addObject("message", "This is the Welcome page. No Authentication is require for this section");
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping(value="/user**")
	public ModelAndView privatePage(){
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Example using Annotation");
		model.addObject("message","This the private section that requires Authentication");
		model.setViewName("user");
		return model;
	}
	
	@RequestMapping(value="/admin**")
	public ModelAndView adminPage(){
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Example using Annotation");
		model.addObject("message", "This is the admin Page");
		model.setViewName("user");
		return model;
	}
}
