package com.tameen.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "Insurance_Policy")
public class InsurancePolicy extends CommonEntity {
	private static final long serialVersionUID = 1L;

	private String policyNum;
	private String insuranceCompany;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "policy")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<PolicyRenewal> policyRenewal;

	public String getPolicyNum() {
		return policyNum;
	}

	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public Set<PolicyRenewal> getPolicyRenewal() {
		return policyRenewal;
	}

	public void setPolicyRenewal(Set<PolicyRenewal> policyRenewal) {
		this.policyRenewal = policyRenewal;
	}

}