package oopWithNLayeredAppHomework.business;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.core.logging.Logger;
import oopWithNLayeredAppHomework.dataAccess.CourseDao;
import oopWithNLayeredAppHomework.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private ArrayList<Course> courses;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.courses = courseDao.getAllCourses();
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		
		
		for (Course c : courses) {
			if(course.getCourseName().equalsIgnoreCase(c.getCourseName())) {
				throw new Exception("HATA!!! Bu isimde bir kurs zaten mevcuttur.:  "+ c.getCourseName());
			}
			
			if(course.getCoursePrice()<0){
				throw new Exception("HATA!!! Kursun fiyatı 0'dan küçük olamaz.");
			}
			
		}
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
}
