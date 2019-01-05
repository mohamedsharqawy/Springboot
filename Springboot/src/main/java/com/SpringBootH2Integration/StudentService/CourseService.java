package com.SpringBootH2Integration.StudentService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootH2Integration.StudentRepository.CourseRepository;

import com.SpringBootH2Integration.model.course;

@Service
public class CourseService {
	
	@Autowired
	 
	CourseRepository courserepository;
	
public ArrayList<course> getAllCourses(){
		
		ArrayList<course> courses= new ArrayList<course>();
		courserepository.findAll().forEach(course -> courses.add(course));
		return courses;
		
	}
	
	public course getCourseByID(int  id) {
		return courserepository.findById((int) id).get();
	}
	
	public void DeleteById(int id) {
		courserepository.deleteById(id);
	}

	public void SaveorUpdate(course course) {
		courserepository.save(course);
	}
}
