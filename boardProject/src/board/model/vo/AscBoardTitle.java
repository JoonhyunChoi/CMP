package board.model.vo;

import java.util.Comparator;

public class AscBoardTitle implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Board cob1 = (Board) o1;
		Board cob2 = (Board) o2;
		
		
		
		return cob1.getBoardTitle().compareTo(cob2.getBoardTitle());
	}

}
