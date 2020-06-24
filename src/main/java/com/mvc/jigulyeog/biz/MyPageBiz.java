package com.mvc.jigulyeog.biz;

import java.util.List;

import com.mvc.jigulyeog.model.dto.ChungwonDto;
import com.mvc.jigulyeog.model.dto.OrgDto;
import com.mvc.jigulyeog.model.dto.ProjectDto;
import com.mvc.jigulyeog.model.dto.TogetherDto;

public interface MyPageBiz {

	public List<ProjectDto> getMyDonateProjectList(String user_id);
	public List<OrgDto> getMySubscribeOrgList(String user_id);
	public List<ChungwonDto> getMySignUpList(String user_id);
	public List<ChungwonDto> getMyChungwonList(String user_id);
	public List<TogetherDto> getMyTogetherApplyList(String user_id);
	public List<TogetherDto> getMyTogetherList(String user_id);
	
}



