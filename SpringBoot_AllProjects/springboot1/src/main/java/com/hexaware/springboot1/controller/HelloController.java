package com.hexaware.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller                    // web application
@RequestMapping("/app")
public class HelloController {  // controller or servlet
	
	
		@RequestMapping(value="/hello" , method = RequestMethod.GET)
		@ResponseBody
		  public String    sayHello() {
			  
			  return "Hello Friends";
			  
		  }
	
		@RequestMapping(value="/home" , method = RequestMethod.GET)
		@ResponseBody
		 public String    display() {
			  
	return "<h1 style='background-color:yellow'>WELCOME TO HOME PAGE</h1>";
			  
		  }
		
		
		

}
