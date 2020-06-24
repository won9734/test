package com.mvc.jigulyeog.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.jigulyeog.model.dto.OrgDto;

@Repository
public class OrgDaoImpl implements OrgDao{
	Logger logger = LoggerFactory.getLogger(OrgDaoImpl.class);
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public List<OrgDto> orgList(int startRow, int endRow) {
		List<OrgDto> orgList = new ArrayList<OrgDto>();
		Map<Object, Object> param = new HashMap<Object,Object>();
		param.put("startRow", startRow);
		param.put("endRow", endRow);
		
		try {
			orgList = sqlSession.selectList(NAMESPACE+"getOrgList",param);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return orgList;
	}

	@Override
	public int getTotalOrg() {
		logger.info("[ getTotalOrg ]");
		
		int totalOrg = 0;
		try {
			totalOrg = sqlSession.selectOne(NAMESPACE+"getTotalOrg");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.info("[ getTotalOrg : "+totalOrg+" ]");
		return totalOrg;
	}

	@Override
	public int totalOrgSearch(String keyword) {
		logger.info("[ OrgDao : totalArticleSearch]");
		int totalOrgSearch =0;
		try {
			totalOrgSearch = sqlSession.selectOne(NAMESPACE+"totalOrgSearch",keyword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("[ totalOrgSearch : "+totalOrgSearch+" ]");
		return totalOrgSearch;
	}

	@Override
	public List<OrgDto> getOrgListSearch(int startRow, int endRow, String keyword) {
		logger.info("[ OrgDao : getOrgListSearch]");
		List<OrgDto> orgList = new ArrayList<OrgDto>();
		Map<Object,Object> param = new HashMap<Object,Object>();
		param.put("startRow", startRow);
		param.put("endRow", endRow);
		param.put("keyword", keyword);
		try {
			orgList = sqlSession.selectList(NAMESPACE+"getOrgListSearch",param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return orgList;
	}

}
