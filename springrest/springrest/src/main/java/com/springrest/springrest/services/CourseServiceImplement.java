package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImplement implements  CourseServices{

	List<Course> course;
	@Override
	public List<Course> getAllNames() {
		// TODO Auto-generated method stub
		course=new ArrayList<>();
		course.add(new Course(112244,"DSA"));
		course.add(new Course(119944,"Networking"));
		return course;
	}
	public Course getCourse(long id)
	{
		for(Course c:course)
		{
			if(c.getId()==id)
				return c;
		}
		return null;
	}
	public Course addCourse(Course c)
	{
		course.add(c);
		return c;
		
	}
	
	public List<Course> getAllCourses() {
		return course;
	}
	
	@Override
	public Course update_Course(Course obj) {
		// TODO Auto-generated method stub
		for(Course c:course)
		{
			if(c.getId()==obj.getId())
			{
				c.setCourse(obj.getCourse());
				return c;
			}
		}
		return null;
	}
	
}
