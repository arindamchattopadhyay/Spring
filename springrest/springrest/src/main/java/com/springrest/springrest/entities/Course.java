package com.springrest.springrest.entities;

public class Course {
	private long id;
	private String course;
	public Course(long id, String course) {
		super();
		this.id = id;
		this.course = course;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Course [id="+id+ ", course="+ course+" ]";
	}
	
}
