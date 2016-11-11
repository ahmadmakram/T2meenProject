package com.tameen.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.tameen.model.Employee;
import com.tameen.model.Member;
import com.tameen.service.SearchService;
import com.tameen.util.PagesURL;
import com.tameen.util.SearchType;

@Component("searchController")
@Scope("request")
public class SearchController extends BaseController implements Serializable {
	private static final long serialVersionUID = 1L;
	private String searchType;
	private String searchVal;
	private Map<String, String> searchList;
	@Autowired
	private SearchService searchService;
	private Member memberResult;
	private Employee employeeResult;

	public SearchController() {
		searchList = new HashMap<String, String>();
		searchList.put(SearchType.IQAMA.getCode(), SearchType.IQAMA.getCode());
		searchList.put(SearchType.PROJECT.getCode(), SearchType.PROJECT.getCode());
		searchList.put(SearchType.EMPLOYEE_ID.getCode(), SearchType.EMPLOYEE_ID.getCode());
	}

	public void search() {
		if (getSearchType().equals(SearchType.IQAMA.getCode())) {
			memberResult = searchService.findMemberByIqamaId(Long.parseLong(getSearchVal()));
			setCurrentPath(PagesURL.MEMBER_RESULT.getPath());
		} else if (getSearchType().equals(SearchType.EMPLOYEE_ID.getCode())) {
			employeeResult = searchService.findEmployeeById(Long.parseLong(getSearchVal()));
			setCurrentPath(PagesURL.EMPLOYEE_RESULT.getPath());
		} else
			setCurrentPath(PagesURL.INDEX.getPath());
	}

	public Member getMemberResult() {
		return memberResult;
	}

	public void setMemberResult(Member memberResult) {
		this.memberResult = memberResult;
	}

	public Employee getEmployeeResult() {
		return employeeResult;
	}

	public void setEmployeeResult(Employee employeeResult) {
		this.employeeResult = employeeResult;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public Map<String, String> getSearchList() {
		return searchList;
	}

	public void setSearchList(Map<String, String> searchList) {
		this.searchList = searchList;
	}

	public String getSearchVal() {
		return searchVal;
	}

	public void setSearchVal(String searchVal) {
		this.searchVal = searchVal;
	}

	public void onCountryChange() {
		System.out.println("SearchType >>>>" + getSearchType());
		setSearchVal("");
		setCurrentPath("");
	}

}
