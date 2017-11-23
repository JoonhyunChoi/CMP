package model.dto;

public class Theater {
	private String Zone;
	private String Position;
	
	public Theater(){}

	public Theater(String zone, String position) {
		super();
		Zone = zone;
		Position = position;
	}

	public String getZone() {
		return Zone;
	}

	public String getPosition() {
		return Position;
	}

	public void setZone(String zone) {
		Zone = zone;
	}

	public void setPosition(String position) {
		Position = position;
	}
	
	
}
