package com.mvc.jigulyeog.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.jigulyeog.biz.OrgBiz;
import com.mvc.jigulyeog.model.dto.OrgDto;
import com.mvc.jigulyeog.model.dto.PageMaker;
import com.mvc.jigulyeog.model.dto.Paging;

@Controller
public class OrgController {
	private static final Logger logger = LoggerFactory.getLogger(OrgController.class);
	
	@Autowired
	OrgBiz ob;
	
	@RequestMapping("/org.do")
	public String orgSearchForm(Model model, 
			@RequestParam(value="orgPage", required=false) Integer orgPage,
			@RequestParam(value="keyword", required=false) String keyword) {
		logger.info("[org_search Page]");
		
		Boolean searchIs = (keyword==null)?true:false;
		
		if(searchIs) {
			if(orgPage == null) {
				orgPage = 1;
			}
			Paging paging = ob.orgPaging(orgPage);
			List<OrgDto> orgList = ob.orgList(paging);
			PageMaker maker = ob.getPageMaker(paging);
			
			model.addAttribute("orgList",orgList);
			model.addAttribute("orgPage",orgPage);
			model.addAttribute("PageMaker",maker);
		} else {
			
			if(orgPage == null) {
				orgPage = 1;
			}
			
			keyword=keyword.trim();
			
			Paging paging = ob.orgPagingSearch(orgPage,keyword);
			List<OrgDto> orgList = ob.orgListSearch(paging,keyword);
			PageMaker maker = ob.getPageMaker(paging);
			
			model.addAttribute("orgList",orgList);
			model.addAttribute("orgPage",orgPage);
			model.addAttribute("PageMaker",maker);
			model.addAttribute("keyword",keyword);
		}
		
		return "/org/org_search";
	}
}
