package com.tameen.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Policy_Renewal")
public class PolicyRenewal implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Long id; 
	private Date insertionDate;
	@ManyToOne
	private InsurancePolicy policy;
	private Date renewalDate;
	private Date renewalExpiryDate;
	private int renewalNum;
	private Long invoiceValue;
	private String invoiceNum;
	private Date financeRecivingDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getInsertionDate() {
		return insertionDate;
	}
	public void setInsertionDate(Date insertionDate) {
		this.insertionDate = insertionDate;
	}
	public InsurancePolicy getPolicy() {
		return policy;
	}
	public void setPolicy(InsurancePolicy policy) {
		this.policy = policy;
	}
	public Date getRenewalDate() {
		return renewalDate;
	}
	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}
	public Date getRenewalExpiryDate() {
		return renewalExpiryDate;
	}
	public void setRenewalExpiryDate(Date renewalExpiryDate) {
		this.renewalExpiryDate = renewalExpiryDate;
	}
	public int getRenewalNum() {
		return renewalNum;
	}
	public void setRenewalNum(int renewalNum) {
		this.renewalNum = renewalNum;
	}
	public Long getInvoiceValue() {
		return invoiceValue;
	}
	public void setInvoiceValue(Long invoiceValue) {
		this.invoiceValue = invoiceValue;
	}
	public String getInvoiceNum() {
		return invoiceNum;
	}
	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	public Date getFinanceRecivingDate() {
		return financeRecivingDate;
	}
	public void setFinanceRecivingDate(Date financeRecivingDate) {
		this.financeRecivingDate = financeRecivingDate;
	}
	
	

}