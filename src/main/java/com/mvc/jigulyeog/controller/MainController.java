package com.mvc.jigulyeog.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.jigulyeog.model.dto.UserDto;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("index.do")
	public String startIndexPage() {
		logger.info("[start index page]");
		return "index";
	}
	
	@RequestMapping("login.do")
	public String testLogin(HttpSession session) {
		logger.info("[temporary LOGIN]");
		UserDto user = new UserDto("ORG01","1111","(사)무지개세상","장승진","01012341234","서울특별시 서초구 매헌로 54 (양재동)","",1);
		session.setAttribute("user", user);
		
		return "redirect:index.do";
	}
}
