package oopWithNLayeredAppHomework.entities;

public class Course {

	private String courseName;
	private String courseType;
	private int courseId;
	
	public Course() {
		
	}

	public Course(String courseName, String courseType, int courseId) {
		this.courseName = courseName;
		this.courseType = courseType;
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
	
	
}
