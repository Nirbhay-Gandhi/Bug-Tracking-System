package model;

public class Tester extends User{

	public Tester(int userId, String userName, String userEmail) {
		super(userId, userName, userEmail);
		this.userType = UserTypeEnum.Tester;
	}

	@Override
	public String toString() {
		return "Tester [userType=" + userType + ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName()
				+ ", getUserEmail()=" + getUserEmail() + ", getUserType()=" + getUserType() + "]";
	}	

}