package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//컨트롤러 구현
//1. Controller 인터페이스 구현
//2. @Controller 어노테이션 사용

@Controller
@RequestMapping(value="/ex03.do")
public class Ex03Controller {
	
	//요청 메소드(핸들러) > 맘대로
	@RequestMapping
	public String test() {
		
		//업무 코드 작성
		
		//뷰 호출
		
		//JSP 이미지 이름 > ViewResolver
		// >> "/WEB-INF/view/ex03.jsp"
		return "ex03";	//JSP 페이지 이름
		
	}

}
