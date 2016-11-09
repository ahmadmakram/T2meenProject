package com.tameen.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tameen.model.Project;
import com.tameen.service.SearchService;

@Component()
public class SearchController implements Serializable {
	private static final long serialVersionUID = 1L;
	private String searchType;
	private String searchVal;
	private Map<String, String> searchList;
	private Project project;
	@Autowired
	private SearchService searchService;

	public SearchController() {
		searchList = new HashMap<String, String>();
		searchList.put("Iqama", "Iqama");
		searchList.put("Project", "project");
		searchList.put("acc", "acc");

	}

	public void search() {
		System.out.println("searchhhhhhhhhhhhhhhhhhhhhhhhh");
		switch (searchType) {
		case "Iqama":
		//	searchResult = searchService.findEmployeeById(Long.parseLong(getSearchVal()));
			break;

		default:
			break;
		}
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
		if (searchType != null && !searchType.equals(""))
			System.out.println(searchType);

	}

}
