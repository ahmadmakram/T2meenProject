package com.tameen.controller;

import java.io.Serializable;

import com.tameen.model.User;



public class BaseController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private String currentPath;
	private User loggedInUser;

	public BaseController() {
		System.out.println("Base controller");
	}

	public String getCurrentPath() {
		return currentPath;
	}

	public void setCurrentPath(String currentPath) {
		this.currentPath = currentPath;
	}

	public User getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(User loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	

}
