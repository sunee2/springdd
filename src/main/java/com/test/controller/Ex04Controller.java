package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex04Controller {

	@RequestMapping("/ex04.do")
	public String ex04() {
		
		return "ex04";
		
	}
	
	@RequestMapping("/ex04_1.do")
	public String ex04_1() {
		
		return "ex04";
		
	}
	
}













