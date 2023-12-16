package model;

import java.time.LocalDateTime;

public class ProjectManager extends User{
	
	public LocalDateTime lastLoggedIn;

	public ProjectManager(int userId, String userName, String userEmail, LocalDateTime lastLoggedIn) {
		super(userId, userName, userEmail);
		this.userType = UserTypeEnum.ProjectManager;
		this.lastLoggedIn = lastLoggedIn;
	}
	
	public LocalDateTime getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(LocalDateTime lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}

	@Override
	public String toString() {
		return "ProjectManager [lastLoggedIn=" + lastLoggedIn + ", userType=" + userType + ", getLastLoggedIn()="
				+ getLastLoggedIn() + ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName()
				+ ", getUserEmail()=" + getUserEmail() + ", getUserType()=" + getUserType() + "]";
	}

}