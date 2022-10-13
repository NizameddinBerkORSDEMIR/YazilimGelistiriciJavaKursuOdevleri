package oopWithNLayeredAppHomework.dataAccess;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.entities.Course;

public class HibernateCourseDao implements CourseDao {
	
	@Override
	public void add(Course course) {
		System.out.println("Kurs verileri Hibernate ile kaydedildi.");
	}
	
	@Override
	public ArrayList<Course> getAllCourses(){
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(new Course("JAVA","Programlama",1));
		courses.add(new Course("Python","Programlama",2));
		courses.add(new Course("C#","Programlama",3));
		
		return courses;
	}
	
}