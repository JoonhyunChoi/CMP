package model.dto;

public class SeatReserv {
	private int TotalSeat;
	private int ReserveSeat;
	
	public SeatReserv(){}
	
	public SeatReserv(int totalSeat, int reserveSeat) {
		super();
		TotalSeat = totalSeat;
		ReserveSeat = reserveSeat;
	}

	public int getTotalSeat() {
		return TotalSeat;
	}

	public int getReserveSeat() {
		return ReserveSeat;
	}

	public void setTotalSeat(int totalSeat) {
		TotalSeat = totalSeat;
	}

	public void setReserveSeat(int reserveSeat) {
		ReserveSeat = reserveSeat;
	}
	
	
}
