package com.SpringBootH2Integration.RestController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootH2Integration.StudentService.CourseService;

import com.SpringBootH2Integration.model.course;

@RestController
public class CourseController {

	
@Autowired
	
	CourseService courseservice;
	
	 @RequestMapping(value = "/courses", method = RequestMethod.GET)
	
	private ArrayList<course> getAllCourses(){
		return courseservice.getAllCourses();
		
	}
	
	@RequestMapping(value = "/course", method = RequestMethod.GET)
	
	private course getcourseById(int id) {
		
		return courseservice.getCourseByID(id);
	}
	
	@DeleteMapping("courses/{id}")

	private void DeleteCourseById(int id) {
		courseservice.DeleteById(id);;
	}
	
	@RequestMapping(value = "/course", method = RequestMethod.POST)
	private int AddNewcourse(@RequestBody course course) {
		courseservice.SaveorUpdate(course);
		return course.getId();
	}
	
}
