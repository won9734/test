package com.mvc.jigulyeog.model.dao;

import java.util.List;


import com.mvc.jigulyeog.model.dto.OrgDto;

public interface OrgDao {
	String NAMESPACE = "mapper.org.";
	
	List<OrgDto> orgList(int startRow, int endRow);
		
	int getTotalOrg();

	int totalOrgSearch(String keyword);

	List<OrgDto> getOrgListSearch(int startRow, int endRow, String keyword);

}
