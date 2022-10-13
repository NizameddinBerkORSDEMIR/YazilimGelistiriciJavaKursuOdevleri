package oopWithNLayeredAppHomework.dataAccess;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {
	
	@Override
	public void add(Teacher teacher) {
		System.out.println("Eğitmen verileri Hibernate ile Eklendi.");
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
