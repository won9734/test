package com.mvc.jigulyeog.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.mvc.jigulyeog.biz.MyPageBiz;
import com.mvc.jigulyeog.model.dto.ChungwonDto;
import com.mvc.jigulyeog.model.dto.OrgDto;
import com.mvc.jigulyeog.model.dto.ProjectDto;
import com.mvc.jigulyeog.model.dto.TogetherDto;
import com.mvc.jigulyeog.model.dto.UserDto;


@Controller
public class MyPageController {
	private static final Logger logger = LoggerFactory.getLogger(MyPageController.class);
	
	@Autowired
	private MyPageBiz mpb;
	
	
	@RequestMapping("/myPage.do")
	public String user_mypage() {
		logger.info("[user_mypage Page]");	
		
		return "/mypage/user_mypage";
	}
	
	@RequestMapping("/myDonate.do")
	public String user_mydonate(HttpSession session, Model model) {
		logger.info("[user_mydonate Page]");
		
		UserDto user = (UserDto)session.getAttribute("user");
		String user_id = user.getUser_id();
		
		List<ProjectDto> projectList = mpb.getMyDonateProjectList(user_id);
		List<OrgDto> orgList = mpb.getMySubscribeOrgList(user_id);
				
		for(ProjectDto dto : projectList){
			System.out.println(dto);
		};
		for(OrgDto dto : orgList) {
			System.out.println(dto);
		}
		
		model.addAttribute("projectList", projectList);
		model.addAttribute("orgList",orgList);
		
		return "/mypage/user_mydonate";
	}
	
	@RequestMapping("/myAction.do")
	public String user_myaction(HttpSession session, Model model) {
		logger.info("[user_myaction Page]");
		
		UserDto user = (UserDto)session.getAttribute("user");
		String user_id = user.getUser_id();
		
		List<ChungwonDto> signUpList = mpb.getMySignUpList(user_id);
		List<ChungwonDto> chungwonList = mpb.getMyChungwonList(user_id);
		List<TogetherDto> togetherApplyList = mpb.getMyTogetherApplyList(user_id);
		List<TogetherDto> togetherList = mpb.getMyTogetherList(user_id);
		
		for(ChungwonDto dto : signUpList){
			System.out.println(dto);
		};
		for(ChungwonDto dto : chungwonList){
			System.out.println(dto);
		};
		for(TogetherDto dto : togetherApplyList){
			System.out.println(dto);
		};
		for(TogetherDto dto : togetherList){
			System.out.println(dto);
		};
		
		model.addAttribute("signUpList",signUpList);
		model.addAttribute("chungwonList",chungwonList);
		model.addAttribute("togetherApplyList",togetherApplyList);
		model.addAttribute("togetherList",togetherList);
		
		return "/mypage/user_myaction";
	}
	
	@RequestMapping("/user_updateform.do")
	public String user_updateform(){
		logger.info("[user_updateform Page]");
		
		return "/mypage/user_updateform";
	}
	
	
	@RequestMapping("/secession.do")
	public String secession() {
		logger.info("[secession Page]");
		
		return "/mypage/secession";
	}
	
}
