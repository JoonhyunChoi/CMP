package model.dto;

public class PlaceChoice implements java.io.Serializable{
	private String place;
	private String date;

	
	public PlaceChoice(){}
	public PlaceChoice(String place, String date){
		this.place=place;
		this.date=date;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Placedate [place=" + place + ", date=" + date + "]";
	}
	
	 
	
}

	
