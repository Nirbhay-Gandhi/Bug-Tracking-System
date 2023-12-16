package model;

import java.util.Objects;

public class User implements Comparable<User>{

	private String userId;
	private String userName;
	private String userEmail;
	protected UserTypeEnum userType;
	
	public User(String userId, String userName, String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public UserTypeEnum getUserType() {
		return userType;
	}

	public void setUserType(UserTypeEnum userType) {
		this.userType = userType;
	}
	
	
	
	@Override
	public int hashCode() {
//		return Objects.hash(userEmail, userId, userName, userType);
		return Objects.hash(userType);
	}

	@Override
	public boolean equals(Object obj) {
		return this.userId == ((User)obj).userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}

	@Override
	public int compareTo(User o) {
		return this.userId.compareTo(o.userId);
	}
	
}
