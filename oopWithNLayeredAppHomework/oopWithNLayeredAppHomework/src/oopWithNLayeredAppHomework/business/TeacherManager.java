package oopWithNLayeredAppHomework.business;

import java.beans.Expression;
import java.util.ArrayList;

import oopWithNLayeredAppHomework.core.logging.Logger;
import oopWithNLayeredAppHomework.dataAccess.TeacherDao;
import oopWithNLayeredAppHomework.entities.Teacher;

public class TeacherManager {
	
	private TeacherDao teacherDao;
	private ArrayList<Teacher> teachers;
	private Logger[] loggers;

	
	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
		this.teacherDao = teacherDao;
		this.teachers = teacherDao.getAllTeachers();
		this.loggers = loggers;
	}
	
	public void add(Teacher teacher) throws Exception {
		
		for (Teacher t : teachers) {
			if(teacher.getFullName().equalsIgnoreCase(t.getFullName())) {
				throw new Exception("HATA!!! Bu bilgilerle kayıtlı başka bir eğitmen bulunmaktadır: "+ t.getFullName());
			}
			
		}
		
		teacherDao.add(teacher);
		
		for (Logger logger : loggers) {
			logger.log(teacher.getFullName());
		}
		
		}
	

	}
