package model.dto;

public class NonMember {
	private String UserName;
	private String Phone;
	private String UserPwd;
	
	public NonMember(){}

	public NonMember(String userName, String phone, String userPwd) {
		super();
		UserName = userName;
		Phone = phone;
		UserPwd = userPwd;
	}

	public String getUserName() {
		return UserName;
	}

	public String getPhone() {
		return Phone;
	}

	public String getUserPwd() {
		return UserPwd;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
	}
	
	
	
	
}
