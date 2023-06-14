package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Ex05Controller {

	@GetMapping("/ex05.do")	//add.do 역할
	public String ex05() {
		
		return "ex05";
		
	}
	
	//데이터 수신
	// - 기존: req.getParameter("")
	
	@PostMapping("/ex05ok.do")	//addok.do 역할
	public String ex05ok(HttpSession session, HttpServletRequest req, HttpServletResponse resp) {
		
		System.out.println(req == null);
		System.out.println(resp == null);
		System.out.println(session == null);
		
		return "ex05ok";
		
	}
	
}
