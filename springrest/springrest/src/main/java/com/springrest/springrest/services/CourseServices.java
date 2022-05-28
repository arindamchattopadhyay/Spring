package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseServices {
	List<Course> getAllNames();
	List<Course> getAllCourses();
	Course getCourse(long id);
	Course addCourse(Course c);
	Course update_Course(Course obj);
	
}
