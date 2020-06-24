package com.mvc.jigulyeog.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.jigulyeog.model.dto.ChungwonDto;
import com.mvc.jigulyeog.model.dto.OrgDto;
import com.mvc.jigulyeog.model.dto.ProjectDto;
import com.mvc.jigulyeog.model.dto.TogetherDto;

@Repository
public class MyPageDaoImpl implements MyPageDao{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<ProjectDto> getMyDonateProjectList(String user_id) {
		List<ProjectDto> projectList = new ArrayList<ProjectDto>();
		projectList = sqlSession.selectList(NAMESPACE+"myDonateProjectList", user_id);
		return projectList;
	}

	@Override
	public List<OrgDto> getMySubscribeOrgList(String user_id) {
		List<OrgDto> orgList = new ArrayList<OrgDto>();
		orgList = sqlSession.selectList(NAMESPACE+"mySubscribeOrgList", user_id);
		return orgList;
	}

	@Override
	public List<ChungwonDto> getMySignUpList(String user_id) {
		List<ChungwonDto> signUpList = new ArrayList<ChungwonDto>();
		signUpList = sqlSession.selectList(NAMESPACE+"mySignUpList", user_id);
		return signUpList;
	}

	@Override
	public List<ChungwonDto> getMyChungwonList(String user_id) {
		List<ChungwonDto> chungwonList = new ArrayList<ChungwonDto>();
		chungwonList = sqlSession.selectList(NAMESPACE+"myChungwonList", user_id);
		return chungwonList;
	}

	@Override
	public List<TogetherDto> getMyTogetherApplyList(String user_id) {
		List<TogetherDto> togetherApplyList = new ArrayList<TogetherDto>();
		togetherApplyList = sqlSession.selectList(NAMESPACE+"myTogetherApllyList", user_id);
		return togetherApplyList;
	}

	@Override
	public List<TogetherDto> getMyTogetherList(String user_id) {
		List<TogetherDto> togetherList = new ArrayList<TogetherDto>();
		togetherList = sqlSession.selectList(NAMESPACE+"myTogetherList", user_id);
		return togetherList;
	}

}
