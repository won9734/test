package com.mvc.jigulyeog.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.jigulyeog.model.dao.MyPageDao;
import com.mvc.jigulyeog.model.dto.ChungwonDto;
import com.mvc.jigulyeog.model.dto.OrgDto;
import com.mvc.jigulyeog.model.dto.ProjectDto;
import com.mvc.jigulyeog.model.dto.TogetherDto;

@Service
public class MyPageBizImpl implements MyPageBiz{
	
	@Autowired
	private MyPageDao dao;
	
	@Override
	public List<ProjectDto> getMyDonateProjectList(String user_id) {
		List<ProjectDto> projectList = dao.getMyDonateProjectList(user_id);
		return projectList;
	}

	@Override
	public List<OrgDto> getMySubscribeOrgList(String user_id) {
		List<OrgDto> orgList = dao.getMySubscribeOrgList(user_id);
		return orgList;
	}

	@Override
	public List<ChungwonDto> getMySignUpList(String user_id) {
		List<ChungwonDto> signUpList = dao.getMySignUpList(user_id);
		return signUpList;
	}

	@Override
	public List<ChungwonDto> getMyChungwonList(String user_id) {
		List<ChungwonDto> chungwonList = dao.getMyChungwonList(user_id);
		return chungwonList;
	}

	@Override
	public List<TogetherDto> getMyTogetherApplyList(String user_id) {
		List<TogetherDto> togetherApplyList = dao.getMyTogetherApplyList(user_id);
		
		return togetherApplyList;
	}

	@Override
	public List<TogetherDto> getMyTogetherList(String user_id) {
		List<TogetherDto> togetherList = dao.getMyTogetherList(user_id);
		return togetherList;
	}

}
