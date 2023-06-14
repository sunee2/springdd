package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class Ex06Controller {

	//요청 메소드의 반환 자료형
	
	//1. String
	//- JSP 파일명
	//- ViewResolver 호출
	
//	@GetMapping("/ex06.do")
//	public String test() {
//		return "ex06";
//	}
	
	
	//2. void
	//- 요청 주소와 동일한 이름의 JSP 페이지를 자동으로 호출한다
	
//	@GetMapping("/ex06.do")
//	public void test() {
//		
//	}
	
	
	//3. String + 키워드
	//- "redirect: URL" > 페이지 새로고침: 주소 변경 O > 페이지 이동 시 자주 사용
	//- "forward: URL"	> 주소 변경 X > 자주 사용하지 않음
	
//	@GetMapping("/ex06.do")
//	public String test() {
//		
//		//reponse.sendRedirect()
//		//return "redirect:/ex05.do";
//		
//		//pageContext.forward()
//		return "forward:/ex05.do";
//		
//	}
	
	
	
	
//	@GetMapping("/ex06.do")
//	public String test(RedirectAttributes rttr) {
//		
//		String seq = "5";
//		String type = "1";
//
//		rttr.addAttribute("seq", seq);
//		rttr.addAttribute("type", type);
//		
//		//return "redirect:/ex05.do?seq=" + seq + "&type=" + type;
//		
//		return "redirect:/ex05.do";
//		
//	}
	
	
	
	//4. 객체
	//- @ResponseBody
	//- JSON 반환값을 생성하는 어노테이션
	
//	@GetMapping("/ex06.do")
//	public @ResponseBody SpringDTO test() {
//		
//		SpringDTO dto = new SpringDTO();
//		
//		dto.setName("홍길동");
//		dto.setAge("20");
//		dto.setAddress("서울시");
//		
//		return dto;
//	}
	
	
	@GetMapping("/ex06.do")
	public @ResponseBody SpringDTO test() {
		
		List<SpringDTO> dto = new ArrayList<SpringDTO>();
		
		SpringDTO dto = new SpringDTO();
		
		dto.setName("홍길동");
		dto.setAge("20");
		dto.setAddress("서울시");
		
		
		
		return dto;
	}
	
	
}












