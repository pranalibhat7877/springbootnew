package com.sb8may.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincontrolller {

	@RequestMapping("/")
	public String home(){
		return "home";
	}
	
}
