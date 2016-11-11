package com.tameen.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tameen.model.Member;
import com.tameen.service.SearchService;

@Component("searchBean")
public class MainSearchController implements Serializable {
	private static final long serialVersionUID = 1L;
	private String searchType;
	private String searchID;
	@Autowired
	private SearchService searchService;
	private Member searchResult;

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchID() {
		return searchID;
	}

	public void setSearchID(String searchID) {
		this.searchID = searchID;
	}

	public void search() {
		searchResult = searchService.findEmployeeById(Long.parseLong(getSearchID()));
	}

	public Member getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(Member searchResult) {
		this.searchResult = searchResult;
	}

}
