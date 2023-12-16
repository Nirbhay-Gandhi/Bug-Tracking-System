package model;

import java.util.Set;

public class Team {

	public String teamId;
	public String teamName;
	public ProjectManager projectManager;
	public Set<Developer> developers;
	public Tester tester;
	
	public Team(String teamId, String teamName, ProjectManager projectManager, Set<Developer> developers,
			Tester tester) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.projectManager = projectManager;
		this.developers = developers;
		this.tester = tester;
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

	public ProjectManager getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(ProjectManager projectManager) {
		this.projectManager = projectManager;
	}

	public Set<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(Set<Developer> developers) {
		this.developers = developers;
	}

	public Tester getTester() {
		return tester;
	}

	public void setTester(Tester tester) {
		this.tester = tester;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", projectManager=" + projectManager
				+ ", developers=" + developers + ", tester=" + tester + "]";
	}
	
	
}