package oopWithNLayeredAppHomework.business;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.core.logging.Logger;
import oopWithNLayeredAppHomework.dataAccess.CategoryDao;
import oopWithNLayeredAppHomework.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private ArrayList<Category> categories;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] logger) {
		this.categoryDao = categoryDao;
		this.categories = categoryDao.getAllCategories();
		this.loggers = logger;
		
	}
	
	public void add(Category category) throws Exception {
		
		for (Category c : categories) {
			if(category.getCategoryName().equalsIgnoreCase(c.getCategoryName())) {
				throw new Exception("HATA!!! Bu başlıkla kaydedilmiş mevcut bir kategori bulunmaktadır.: "+c.getCategoryName());
			}
			
			
		}
	
		categoryDao.add(category);
		
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	
	}
	
}
