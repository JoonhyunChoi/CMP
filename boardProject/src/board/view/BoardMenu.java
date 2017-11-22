package board.view;

import java.util.Scanner;

import board.controller.BoardManager;

public class BoardMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== 게시글 서비스 프로그램 ========");
		System.out.println("1. 게시글 쓰기");
		System.out.println("2. 게시글 전체 보기");
		System.out.println("3. 게시글 한개 보기");
		System.out.println("4. 게시글 제목 수정");
		System.out.println("5. 게시글 제목 수정");
		System.out.println("6. 게시글 삭제");
		System.out.println("7. 게시글 검색");
		System.out.println("8. 파일에 저장하기");
		System.out.println("9. 정렬하기");
		System.out.println("0. 끝내기");
		
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
