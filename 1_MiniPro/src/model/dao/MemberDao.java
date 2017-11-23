package model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.dto.Member;

public class MemberDao {
	public void Members(){
		ArrayList<Member> members =new ArrayList<Member>();
		
		for(int i=0; i<members.size();i++){
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("member.dat"))){
				bw.write(members.get(i) + "\n");
				
				System.out.println("회원 가입 완료");
				
			}catch(FileNotFoundException e){
				System.out.println("members.dat 가 존재하지 않음 : 새로만들어짐");
			}catch(IOException e){
				e.printStackTrace();
			}
		
		}
		try(BufferedReader br = new BufferedReader(new FileReader("mambers.txt"))){
			while(true){
				String str= br.readLine();
				
				if(str == null){
					System.out.println("member.txt 파일 읽기 완료");
					break;
				}
				String[] sArr = str.split(",");
				//Member(String userId, String userPwd, String userName, String phone, char gender, String email) {
			Member memberTemp = new Member(sArr[0].trim(), sArr[1].trim(), sArr[2].trim(), sArr[3].trim(), sArr[4].trim().charAt(0), sArr[5].trim());
			
			
			members.add(memberTemp);
			}
			
		}catch(FileNotFoundException e){
			System.out.println("members.txt 가 존재하지 않습니다.");
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
}
