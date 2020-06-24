package com.mvc.jigulyeog.model.dao;

import java.util.List;

import com.mvc.jigulyeog.model.dto.ChungwonDto;
import com.mvc.jigulyeog.model.dto.OrgDto;
import com.mvc.jigulyeog.model.dto.ProjectDto;
import com.mvc.jigulyeog.model.dto.TogetherDto;


public interface MyPageDao {
	String NAMESPACE = "mapper.mypage.";
	
	List<ProjectDto> getMyDonateProjectList(String user_id);

	List<OrgDto> getMySubscribeOrgList(String user_id);

	List<ChungwonDto> getMySignUpList(String user_id);

	List<ChungwonDto> getMyChungwonList(String user_id);

	List<TogetherDto> getMyTogetherApplyList(String user_id);

	List<TogetherDto> getMyTogetherList(String user_id);

}
