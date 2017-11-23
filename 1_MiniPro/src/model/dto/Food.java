package model.dto;

public class Food {
	private String FoCategory;
	private String FoName;
	private String UserPwd;
	
	public Food(){}

	public Food(String foCategory, String foName, String userPwd) {
		super();
		FoCategory = foCategory;
		FoName = foName;
		UserPwd = userPwd;
	}

	public String getFoCategory() {
		return FoCategory;
	}

	public String getFoName() {
		return FoName;
	}

	public String getUserPwd() {
		return UserPwd;
	}

	public void setFoCategory(String foCategory) {
		FoCategory = foCategory;
	}

	public void setFoName(String foName) {
		FoName = foName;
	}

	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
	}
	
	
}
