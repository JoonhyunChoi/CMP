package board.view;

import java.util.Scanner;

import board.controller.BoardManager;

public class BoardMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== �Խñ� ���� ���α׷� ========");
		System.out.println("1. �Խñ� ����");
		System.out.println("2. �Խñ� ��ü ����");
		System.out.println("3. �Խñ� �Ѱ� ����");
		System.out.println("4. �Խñ� ���� ����");
		System.out.println("5. �Խñ� ���� ����");
		System.out.println("6. �Խñ� ����");
		System.out.println("7. �Խñ� �˻�");
		System.out.println("8. ���Ͽ� �����ϱ�");
		System.out.println("9. �����ϱ�");
		System.out.println("0. ������");
		
		BoardManager bm = new BoardManager();
		BoardMenu bmenu = new BoardMenu();
		int num = sc.nextInt();
		switch(num){
		case 1: bm.writeBoard();break;
		case 2: bm.displayAllList();break;
		case 3: bm.displayBoard();break;
		case 4: bm.modifyTitle();break;
		case 5: bm.modifyContent();break;
		case 6: bm.deleteBoard();break;
		case 7: bm.searchBoard();break;
		case 8: bm.saveListFile();break;
		case 9: bmenu.sortSubMenu();break;
		case 0: break;
		}
		
		
		
		
		
	}

	private void sortSubMenu() {
		// TODO Auto-generated method stub
		
	}

}
