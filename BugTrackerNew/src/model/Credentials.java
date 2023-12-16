package model;

import java.time.LocalDateTime;

public class Credentials {

	private String userId;
	private String userEmail;
	private String password;
	private LocalDateTime lastLoggedIn;
	private LocalDateTime lastLoggedOut;
	
	public Credentials(String userId, String userEmail, String password, LocalDateTime lastLoggedIn,
			LocalDateTime lastLoggedOut) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.password = password;
		this.lastLoggedIn = lastLoggedIn;
		this.lastLoggedOut = lastLoggedOut;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public LocalDateTime getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(LocalDateTime lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}

	public LocalDateTime getLastLoggedOut() {
		return lastLoggedOut;
	}

	public void setLastLoggedOut(LocalDateTime lastLoggedOut) {
		this.lastLoggedOut = lastLoggedOut;
	}

	public String getUserEmail() {
		return userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Credentials [userId=" + userId + ", userEmail=" + userEmail + ", password=" + password
				+ ", lastLoggedIn=" + lastLoggedIn + ", lastLoggedOut=" + lastLoggedOut + "]";
	}
	
}