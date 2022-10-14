package oopWithNLayeredAppHomework.dataAccess;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.entities.Category;

public interface CategoryDao {

	void add(Category category);
	
	ArrayList<Category> getAllCategories(); 
}
