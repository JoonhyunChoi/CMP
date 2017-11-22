package board.model.vo;

import java.util.Comparator;

public class AscBoardNo implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		
		Board cob1 = (Board) o1;
		Board cob2 = (Board) o2;
		
		int result =0;
		
		if(cob1.getBoardNo() == cob2.getBoardNo()){
			result =0;
		}
		if(cob1.getBoardNo() > cob2.getBoardNo()){
			result =1;
		}
		if(cob1.getBoardNo() < cob2.getBoardNo()){
			result =-1;
		}
		return result;
	}

}
