package model;

import java.util.Set;

public class Team2 {
	
	public String teamId;
	public String teamName;
	public String projectMgrId;
	public Set<String> developers;
	public String testerId;
	
	public Team2(String teamId, String teamName, String projectMgrId, Set<String> developers, String testerId) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.projectMgrId = projectMgrId;
		this.developers = developers;
		this.testerId = testerId;
	}
	
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getProjectManager() {
		return projectMgrId;
	}
	public void setProjectManager(String projectMgrId) {
		this.projectMgrId = projectMgrId;
	}
	public Set<String> getDeveloper() {
		return developers;
	}
	public void setDeveloper(Set<String> developers) {
		this.developers = developers;
	}
	public String getTester() {
		return testerId;
	}
	public void setTester(String testerId) {
		this.testerId = testerId;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", projectManager=" + projectMgrId
				+ ", developer=" + developers + ", tester=" + testerId + "]";
	}

}