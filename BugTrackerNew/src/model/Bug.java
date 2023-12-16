package model;

import java.time.LocalDate;

public class Bug {

	public String bugId;
	public String title;
	public String desc;
	public String projectName;
	public String createdBy;
	public LocalDate openDate;
	public String assignedTo;
	public boolean markedForClosing;
	public LocalDate closeDate;
	public String closedBy;
	public StatusEnum status;
	public SeverityLevelEnum severityLevel;
	
	public Bug(String bugId, String title, String desc, String projectName, String createdBy, LocalDate openDate,
			String assignedTo, SeverityLevelEnum severityLevel) {
		super();
		this.bugId = bugId;
		this.title = title;
		this.desc = desc;
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.openDate = openDate;
		this.assignedTo = assignedTo;
		this.markedForClosing = false;
		this.status = StatusEnum.open;
		this.severityLevel = severityLevel;
	}

	public String getBugId() {
		return bugId;
	}

	public void setBugId(String bugId) {
		this.bugId = bugId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public boolean isMarkedForClosing() {
		return markedForClosing;
	}

	public void setMarkedForClosing(boolean markedForClosing) {
		this.markedForClosing = markedForClosing;
	}

	public LocalDate getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(LocalDate closeDate) {
		this.closeDate = closeDate;
	}

	public String getClosedBy() {
		return closedBy;
	}

	public void setClosedBy(String closedBy) {
		this.closedBy = closedBy;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public SeverityLevelEnum getSeverityLevel() {
		return severityLevel;
	}

	public void setSeverityLevel(SeverityLevelEnum severityLevel) {
		this.severityLevel = severityLevel;
	}

	@Override
	public String toString() {
		return "Bug [bugId=" + bugId + ", title=" + title + ", desc=" + desc + ", projectName=" + projectName
				+ ", createdBy=" + createdBy + ", openDate=" + openDate + ", assignedTo=" + assignedTo
				+ ", markedForClosing=" + markedForClosing + ", closeDate=" + closeDate + ", closedBy=" + closedBy
				+ ", status=" + status + ", severityLevel=" + severityLevel + "]";
	}
	
}