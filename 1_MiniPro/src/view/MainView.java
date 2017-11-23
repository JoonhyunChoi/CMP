package view;

public class MainView {

	public static void main(String[] args) {
	
		//초기 MainFrame 기입
		
		
		LoginView LV =new LoginView();
		LV.login(); // 회원 로그인
		LV.NotMLogin(); // 비회원 로그인
		
		MemberView MV = new MemberView();
		
	}

}
