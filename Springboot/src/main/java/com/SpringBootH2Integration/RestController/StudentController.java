package com.SpringBootH2Integration.RestController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootH2Integration.StudentRepository.StudentRepository;
import com.SpringBootH2Integration.StudentService.StudentService;
import com.SpringBootH2Integration.model.Student;

@RestController

public class StudentController {
	
	@Autowired
	
	StudentService studentservice;
	
	 @RequestMapping(value = "/students", method = RequestMethod.GET)
	
	private ArrayList<Student> getAllStudents(){
		return studentservice.getAllStudents();
		
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	
	private Student getStudentById(int id) {
		
		return studentservice.getStudentByID(id);
	}
	
	@DeleteMapping("students/{id}")

	private void DeleteStudentById(int id) {
		 studentservice.DeleteById(id);
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	private int AddNewStudent(@RequestBody Student student) {
		studentservice.SaveorUpdate(student);
		return student.getId();
	}
	

}
