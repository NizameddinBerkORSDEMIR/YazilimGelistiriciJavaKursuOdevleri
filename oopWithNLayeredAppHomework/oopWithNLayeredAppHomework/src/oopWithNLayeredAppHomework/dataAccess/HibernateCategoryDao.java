package oopWithNLayeredAppHomework.dataAccess;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
			System.out.println("Kategori verileri Hibernate ile kaydedildi.");
	}

	@Override
	public ArrayList<Category> getAllCategories() {
		ArrayList<Category> categories = new ArrayList<>();
		categories.add(new Category("Sözel","Test",1));
		categories.add(new Category("Sayısal","Programlama",2));
		categories.add(new Category("Sayısal","Kodlama",3));
		
		return categories;
	}

}
