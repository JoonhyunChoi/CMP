1package board.controller;

import java.io.*;
import java.sql.Date;
import java.util.*;

import board.model.vo.Board;
import list.listSort.Customer;

public class BoardManager {
	ArrayList<Board> list = new ArrayList<Board>();
	Scanner sc = new Scanner(System.in);
	Board bo =new Board();
	
	public BoardManager(){
		
	}
	
	
	public void writeBoard(){
		System.out.println("�� �Խñ� ���� �Դϴ�.");
		System.out.print("������ : ");
		String title = sc.nextLine();
		
		System.out.print("�ۼ��� : ");
		String author = sc.nextLine();
	
		
		System.out.print("�ۼ� ��¥ :");
		System.out.println(bo.getBoardDate());
		
		while(true){
			System.out.println("�۳��� : (exit �Է½� ����)");
			String contents = sc.nextLine();
			
			if(contents.equals("exit")){
			
				break;
			}
			else{
				continue;
			}
		}
		list.add(new Board(title, author, bo.getBoardDate(), contents));
		
		
	}
	
	

	public void displayAllList(){
		
		for(Object obj : list){
			System.out.println((Board)obj);
			
		}
	}


	public void displayBoard() {
		// TODO Auto-generated method stub
		
	}


	public void modifyTitle() {
		// TODO Auto-generated method stub
		
	}


	public void modifyContent() {
		// TODO Auto-generated method stub
		
	}


	public void deleteBoard() {
		// TODO Auto-generated method stub
		
	}


	public void searchBoard() {
		// TODO Auto-generated method stub
		
	}


	public void saveListFile() {
		// TODO Auto-generated method stub
		
	}
}
