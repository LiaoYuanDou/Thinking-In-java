package cn.xx.study.resultful;

public class User {
	private int userId;
	private String userName;
	private String userType;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "{ userId :　" + this.userId + " userName : " + this.userName + " userType : " + this.userType + " }";
	}
}
