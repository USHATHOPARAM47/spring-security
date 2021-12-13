package com.bankingapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "hello...welcome to SBI Bank";
		
	}
	@RequestMapping("/contact")
	public String contact() {
		return "hello...welcome to SBI contact";
		
	}
	@RequestMapping("/about")
	public String about() {
		return "hello...welcome to SBI about";
		
	}
	@RequestMapping("/balance")
	public String balance() {
		return "hello...welcome to SBI balance";
		
	}
}
