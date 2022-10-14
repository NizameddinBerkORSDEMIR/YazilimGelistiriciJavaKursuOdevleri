package oopWithNLayeredAppHomework.dataAccess;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{
	@Override
	public void add(Teacher teacher) {
		System.out.println("Eğitmen verileri JDBC ile Eklendi.");
	}

	@Override
	public ArrayList<Teacher> getAllTeachers() {
		ArrayList<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher("Engin DEMİROĞ","Türkiye",1));
		teachers.add(new Teacher("Nizameddin Berk ÖRSDEMİR","Türkiye",2));
		teachers.add(new Teacher("Ahmet Selim","Türkiye",3));
		
		return teachers;
		
		
	}

}
