package com.mvc.jigulyeog.biz;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvc.jigulyeog.model.dto.OrgDto;
import com.mvc.jigulyeog.model.dto.PageMaker;
import com.mvc.jigulyeog.model.dto.Paging;


public interface OrgBiz {
	
	Paging orgPaging(Integer orgPage);
	List<OrgDto> orgList(Paging paging);
	PageMaker getPageMaker(Paging paging);
	Paging orgPagingSearch(Integer orgPage, String keyword);
	List<OrgDto> orgListSearch(Paging paging, String keyword);

}
