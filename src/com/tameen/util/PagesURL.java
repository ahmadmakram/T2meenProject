package com.tameen.util;

public enum PagesURL {

	HOME_PAGE("home.xhtml"),
	LOGIN("login.xhtml"),
	MEMBER_RESULT("/xhtml/MemberResult.xhtml"),
	EMPLOYEE_RESULT("/xhtml/EmployeeResult.xhtml"),
	INDEX("/xhtml/index.xhtml");
	
	private String path;

	private PagesURL(String path) {
		this.path = path;

	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
