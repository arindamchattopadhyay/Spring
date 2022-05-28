package com.springrest.springrest.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseServices;

@RestController
//appointed as the first layer to intercept request in the application
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		return "this is Home page";
	}
	//get the names
	@Autowired
	private CourseServices courseServices ;
	@GetMapping("/courses")
	public List<Course> addTwoNames()
	{
		return this.courseServices.getAllNames();
	}
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable String id)
	{
		return this.courseServices.getCourse(Long.parseLong(id));
	}
	@GetMapping("/getAllCourses")
	public List<Course> getAllCourses()
	{
		return this.courseServices.getAllCourses();
	}
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseServices.addCourse(course);
	}
	@PutMapping("/update_course")
	public Course update_Course(@RequestBody Course course)
	{
		return this.courseServices.update_Course(course);
	}
		
	
	
}
