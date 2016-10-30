package com.firststep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstStep {
		
		@RequestMapping("/")
		public String getHome() {
			return "index";
		}
	
}
