package oopWithNLayeredAppHomework;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.business.CategoryManager;
import oopWithNLayeredAppHomework.business.CourseManager;
import oopWithNLayeredAppHomework.business.TeacherManager;
import oopWithNLayeredAppHomework.core.logging.DatabaseLogger;
import oopWithNLayeredAppHomework.core.logging.FileLogger;
import oopWithNLayeredAppHomework.core.logging.Logger;
import oopWithNLayeredAppHomework.core.logging.MailLooger;
import oopWithNLayeredAppHomework.dataAccess.CategoryDao;
import oopWithNLayeredAppHomework.dataAccess.CourseDao;
import oopWithNLayeredAppHomework.dataAccess.HibernateCourseDao;
import oopWithNLayeredAppHomework.dataAccess.JdbcCategoryDao;
import oopWithNLayeredAppHomework.dataAccess.JdbcCourseDao;
import oopWithNLayeredAppHomework.dataAccess.JdbcTeacherDao;
import oopWithNLayeredAppHomework.dataAccess.TeacherDao;
import oopWithNLayeredAppHomework.entities.Category;
import oopWithNLayeredAppHomework.entities.Course;
import oopWithNLayeredAppHomework.entities.Teacher;

public class Main {

	public static void main(String[] args) {
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		//Her birini ayrı loglamak istersekte bu şekildede yapabiliriz.
		//Logger[] loggers1 = {new FileLogger(), new DatabaseLogger()};
		//Logger[] loggers2 = {new DatabaseLogger()};
		//Logger[] loggers3 = {new MailLooger()};
		
	
		Teacher teacher1 = new Teacher("Fatih TERİM","Türkiye",4);
		TeacherDao teacherDao = new JdbcTeacherDao();
		
		TeacherManager teacherManager = new TeacherManager(teacherDao,loggers);
		try {
			teacherManager.add(teacher1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//----------------------------------------------------------------------
		
		Course course1 = new Course("JAVASCRIPT","Programlama",4,-17);
		CourseDao courseDao = new JdbcCourseDao();
		
		CourseManager courseManager = new CourseManager(courseDao, loggers);
		try {
			courseManager.add(course1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//----------------------------------------------------------------------
		
		Category category1 = new Category("Sözel","Ayarlar",4);
		CategoryDao categoryDao = new JdbcCategoryDao();
		
		CategoryManager categoryManager = new CategoryManager(categoryDao, loggers);
		try {
			categoryManager.add(category1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	
	
}
