package com.tameen.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Member")
public class Member extends CommonEntity {
	private static final long serialVersionUID = 1L;
	

	private String insurClass;
	private String gender;
	private String relation;
	private Date birthDate;
	private Integer age;
	private String country;
	private Long idNumber;
	private Long dependentIdNumber;
	private String mobile;
	private Date insuranceEffectiveDate;
	private Date insuranceExpiryveDate;
	private String insurancePolicyNo;
	private String insuranceCompany;
	private String premiumValue;

	@ManyToOne
	private Employee empId;

	@ManyToOne
	private Status status;
	@ManyToOne
	private Department department;

	public String getInsurClass() {
		return insurClass;
	}

	public void setInsurClass(String insurClass) {
		this.insurClass = insurClass;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(Long idNumber) {
		this.idNumber = idNumber;
	}

	public Long getDependentIdNumber() {
		return dependentIdNumber;
	}

	public void setDependentIdNumber(Long dependentIdNumber) {
		this.dependentIdNumber = dependentIdNumber;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getInsuranceEffectiveDate() {
		return insuranceEffectiveDate;
	}

	public void setInsuranceEffectiveDate(Date insuranceEffectiveDate) {
		this.insuranceEffectiveDate = insuranceEffectiveDate;
	}

	public Date getInsuranceExpiryveDate() {
		return insuranceExpiryveDate;
	}

	public void setInsuranceExpiryveDate(Date insuranceExpiryveDate) {
		this.insuranceExpiryveDate = insuranceExpiryveDate;
	}

	public String getInsurancePolicyNo() {
		return insurancePolicyNo;
	}

	public void setInsurancePolicyNo(String insurancePolicyNo) {
		this.insurancePolicyNo = insurancePolicyNo;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public String getPremiumValue() {
		return premiumValue;
	}

	public void setPremiumValue(String premiumValue) {
		this.premiumValue = premiumValue;
	}

	public Employee getEmpId() {
		return empId;
	}

	public void setEmpId(Employee empId) {
		this.empId = empId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
