package com.tameen.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Project")
public class Project extends CommonEntity {
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Ministry awardingLetterSender;
	private Date awardingLetterDate;
	private long projectValue;
	private int projectDuration;
	private Date startDate;
	private Date docsRequestedDate;
	private Date docsRecivingDate;
	private Date docsSendingDate;
	private Date pendingDocsRequestedDate;
	private Date pendingDocsRecivingDate;
	private Date pendingDocsSendingDate;
	@OneToOne
	private InsurancePolicy policy;
	
	private String notes;

	@ManyToOne
	private Area area;

	
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Date getAwardingLetterDate() {
		return awardingLetterDate;
	}

	public void setAwardingLetterDate(Date awardingLetterDate) {
		this.awardingLetterDate = awardingLetterDate;
	}

	public long getProjectValue() {
		return projectValue;
	}

	public void setProjectValue(long projectValue) {
		this.projectValue = projectValue;
	}

	public int getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(int projectDuration) {
		this.projectDuration = projectDuration;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Ministry getAwardingLetterSender() {
		return awardingLetterSender;
	}

	public void setAwardingLetterSender(Ministry awardingLetterSender) {
		this.awardingLetterSender = awardingLetterSender;
	}

	public Date getDocsRequestedDate() {
		return docsRequestedDate;
	}

	public void setDocsRequestedDate(Date docsRequestedDate) {
		this.docsRequestedDate = docsRequestedDate;
	}

	public Date getDocsRecivingDate() {
		return docsRecivingDate;
	}

	public void setDocsRecivingDate(Date docsRecivingDate) {
		this.docsRecivingDate = docsRecivingDate;
	}

	public Date getDocsSendingDate() {
		return docsSendingDate;
	}

	public void setDocsSendingDate(Date docsSendingDate) {
		this.docsSendingDate = docsSendingDate;
	}

	public Date getPendingDocsRequestedDate() {
		return pendingDocsRequestedDate;
	}

	public void setPendingDocsRequestedDate(Date pendingDocsRequestedDate) {
		this.pendingDocsRequestedDate = pendingDocsRequestedDate;
	}

	public Date getPendingDocsRecivingDate() {
		return pendingDocsRecivingDate;
	}

	public void setPendingDocsRecivingDate(Date pendingDocsRecivingDate) {
		this.pendingDocsRecivingDate = pendingDocsRecivingDate;
	}

	public Date getPendingDocsSendingDate() {
		return pendingDocsSendingDate;
	}

	public void setPendingDocsSendingDate(Date pendingDocsSendingDate) {
		this.pendingDocsSendingDate = pendingDocsSendingDate;
	}

	public InsurancePolicy getPolicy() {
		return policy;
	}

	public void setPolicy(InsurancePolicy policy) {
		this.policy = policy;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}


}