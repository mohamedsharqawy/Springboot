package com.SpringBootH2Integration.StudentService;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SpringBootH2Integration.StudentRepository.StudentRepository;
import com.SpringBootH2Integration.model.Student;

@Service
public class StudentService {
	
	@Autowired
	
	StudentRepository studentrepository;
	
	public ArrayList<Student> getAllStudents(){
		
		ArrayList<Student> students= new ArrayList<Student>();
		studentrepository.findAll().forEach(student -> students.add(student));
		return students;
		
	}
	
	public Student getStudentByID(int  id) {
		return studentrepository.findById((int) id).get();
	}
	
	public void SaveorUpdate(Student student) {
		studentrepository.save(student);
	}
	
	public void DeleteById(int id) {
		studentrepository.deleteById(id);
	}
	

}
