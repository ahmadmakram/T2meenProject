package com.tameen.model;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends CommonEntity{

	private static final long serialVersionUID = -1703704054345343680L;

	@Column(unique = true)
	private String userName;
	private String password;

	private String fullName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
