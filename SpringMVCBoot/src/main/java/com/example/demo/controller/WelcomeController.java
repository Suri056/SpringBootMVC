package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);
	
	@RequestMapping("/")
	public String showWelcomePage() {
		log.info("Controller Entered Into showWelcomePage..Method..");
		return "welcome";
	}

}
