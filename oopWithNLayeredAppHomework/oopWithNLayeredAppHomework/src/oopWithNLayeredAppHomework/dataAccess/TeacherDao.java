package oopWithNLayeredAppHomework.dataAccess;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.entities.Teacher;

public interface TeacherDao {
	
	void add(Teacher teacher);
	
	ArrayList<Teacher> getAllTeachers();

}
