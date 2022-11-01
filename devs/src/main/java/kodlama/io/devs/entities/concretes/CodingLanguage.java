package kodlama.io.devs.entities.concretes;

public class CodingLanguage {

	private String name;
	private int id;
	
	public CodingLanguage() {
		
	}

	public CodingLanguage(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
