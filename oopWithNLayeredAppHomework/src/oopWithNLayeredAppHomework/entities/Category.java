package oopWithNLayeredAppHomework.entities;

public class Category {

	private String categoryClass;
	private String categoryName;
	private int categoryId;
	
	public Category() {
		
	}

	public Category(String categoryClass, String categoryName, int categoryId) {
		this.categoryClass = categoryClass;
		this.categoryName = categoryName;
		this.categoryId = categoryId;
	}

	public String getCategoryClass() {
		return categoryClass;
	}

	public void setCategoryClass(String categoryClass) {
		this.categoryClass = categoryClass;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
}
