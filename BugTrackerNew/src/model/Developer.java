package model;

import java.util.HashSet;
import java.util.Set;

public class Developer extends User{

	private Set<Project> projectAllocated;

	public Developer(String userId, String userName, String userEmail) {
		super(userId, userName, userEmail);
		this.userType = UserTypeEnum.Developer;	
		projectAllocated = new HashSet<>();
	}

	public Developer(String userId, String userName, String userEmail, UserTypeEnum userType, Set<Project> projectAllocated) {
		super(userId, userName, userEmail);
		this.projectAllocated = projectAllocated;
	}

	public Set<Project> getProjectAllocated() {
		return projectAllocated;
	}

	public void setProjectAllocated(Set<Project> projectAllocated) {
		this.projectAllocated = projectAllocated;
	}

	@Override
	public String toString() {
		return "Developer [projectAllocated=" + projectAllocated + ", userType=" + userType + ", getProjectAllocated()="
				+ getProjectAllocated() + ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName()
				+ ", getUserEmail()=" + getUserEmail() + ", getUserType()=" + getUserType() + "]";
	}
	
}