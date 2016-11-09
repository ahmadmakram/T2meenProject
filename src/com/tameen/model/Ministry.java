package com.tameen.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Ministry extends CommonEntity{

	private static final long serialVersionUID = -1703704054345343680L;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<Employee> employees;
	
	

}
