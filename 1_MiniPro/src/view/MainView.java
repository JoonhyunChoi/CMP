package view;

public class MainView {

	public static void main(String[] args) {
	
		//�ʱ� MainFrame ����
		
		
		LoginView LV =new LoginView();
		LV.login(); // ȸ�� �α���
		LV.NotMLogin(); // ��ȸ�� �α���
		
		MemberView MV = new MemberView();
		
	}

}
