package model;

import java.time.LocalDate;
import java.util.Set;

public class Project {
	
	public String projectId;
	public String projName;
	public String projDesc;
	public LocalDate startDate;
	public ProjectstatusEnum status;
	public Set<Team2> team;
	
	public Project(String projectId, String projName, String projDesc, LocalDate startDate, Set<Team2> team) {
		super();
		this.projectId = projectId;
		this.projName = projName;
		this.projDesc = projDesc;
		this.startDate = startDate;
		this.status = ProjectstatusEnum.InProgress;
		this.team = team;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getProjDesc() {
		return projDesc;
	}

	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public ProjectstatusEnum getStatus() {
		return status;
	}

	public void setStatus(ProjectstatusEnum status) {
		this.status = status;
	}

	public Set<Team2> getTeam() {
		return team;
	}

	public void setTeam(Set<Team2> team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projName=" + projName + ", projDesc=" + projDesc + ", startDate="
				+ startDate + ", status=" + status + ", team=" + team + "]";
	}
	
}