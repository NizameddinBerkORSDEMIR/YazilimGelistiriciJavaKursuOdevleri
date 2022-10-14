package oopWithNLayeredAppHomework.entities;

public class Teacher {

	private String fullName;
	private String nationality;
	private int id;
	
	public Teacher() {
		
	}
	
	public Teacher(String fullName, String nationality, int id) {
		this.fullName = fullName;
		this.nationality = nationality;
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}
