package com.tameen.util;

public enum SearchType {

	IQAMA("Iqama"), PROJECT("Project"), EMPLOYEE_ID("EmployeeId");
	private String code;

	private SearchType(String value) {
		this.code = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
