package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
   @RequestMapping("/welcome")
	public String get(){
		return ("spring boot application");
	}

}
