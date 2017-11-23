package model.dto;

public class Movie {
	private String MoTitle;
	private int MoAge;
	private String MoDir;
	private int MoLike;
	private String MoOpenDate;
	private String MoActer;
	private String MoGenre;
	private int MoTime;
	
	public Movie(){}
	
	public Movie(String moTitle, int moAge, String moDir, int moLike, String moOpenDate, String moActer, String moGenre,
			int moTime) {
		super();
		MoTitle = moTitle;
		MoAge = moAge;
		MoDir = moDir;
		MoLike = moLike;
		MoOpenDate = moOpenDate;
		MoActer = moActer;
		MoGenre = moGenre;
		MoTime = moTime;
	}

	public String getMoTitle() {
		return MoTitle;
	}

	public int getMoAge() {
		return MoAge;
	}

	public String getMoDir() {
		return MoDir;
	}

	public int getMoLike() {
		return MoLike;
	}

	public String getMoOpenDate() {
		return MoOpenDate;
	}

	public String getMoActer() {
		return MoActer;
	}

	public String getMoGenre() {
		return MoGenre;
	}

	public int getMoTime() {
		return MoTime;
	}

	public void setMoTitle(String moTitle) {
		MoTitle = moTitle;
	}

	public void setMoAge(int moAge) {
		MoAge = moAge;
	}

	public void setMoDir(String moDir) {
		MoDir = moDir;
	}

	public void setMoLike(int moLike) {
		MoLike = moLike;
	}

	public void setMoOpenDate(String moOpenDate) {
		MoOpenDate = moOpenDate;
	}

	public void setMoActer(String moActer) {
		MoActer = moActer;
	}

	public void setMoGenre(String moGenre) {
		MoGenre = moGenre;
	}

	public void setMoTime(int moTime) {
		MoTime = moTime;
	}
	
	
	
	
}
