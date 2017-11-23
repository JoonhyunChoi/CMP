
 package model.dto;

public class Member {
	private String UserId;
	private String UserPwd;
	private String UserName;
	private String Phone;
	private char Gender;
	private String Email;
	private int Cash;
	
	



	public Member(String userId, String userPwd, String userName, String phone, char gender, String email) {
		super();
		UserId = userId;
		UserPwd = userPwd;
		UserName = userName;
		Phone = phone;
		Gender = gender;
		Email = email;
	}




	public Member(String userId, String userPwd, String userName, String phone, char gender, String email, int cash) {
		super();
		UserId = userId;
		UserPwd = userPwd;
		UserName = userName;
		Phone = phone;
		Gender = gender;
		Email = email;
		Cash = cash;
	}




	public String getUserId() {
		return UserId;
	}




	public String getUserPwd() {
		return UserPwd;
	}




	public String getUserName() {
		return UserName;
	}




	public String getPhone() {
		return Phone;
	}




	public char getGender() {
		return Gender;
	}




	public String getEmail() {
		return Email;
	}




	public int getCash() {
		return Cash;
	}




	public void setUserId(String userId) {
		UserId = userId;
	}




	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
	}




	public void setUserName(String userName) {
		UserName = userName;
	}




	public void setPhone(String phone) {
		Phone = phone;
	}




	public void setGender(char gender) {
		Gender = gender;
	}




	public void setEmail(String email) {
		Email = email;
	}




	public void setCash(int cash) {
		Cash = cash;
	}
	
	
	
	
	
}
