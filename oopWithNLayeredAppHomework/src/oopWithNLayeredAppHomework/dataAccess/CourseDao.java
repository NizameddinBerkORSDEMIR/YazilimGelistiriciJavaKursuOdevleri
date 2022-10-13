package oopWithNLayeredAppHomework.dataAccess;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.entities.Course;

public interface CourseDao {

	void add(Course course);
	
	ArrayList<Course> getAllCourses();
}
