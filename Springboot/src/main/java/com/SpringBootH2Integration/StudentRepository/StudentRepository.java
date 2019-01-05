package com.SpringBootH2Integration.StudentRepository;
	
import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootH2Integration.model.Student;


	public interface StudentRepository extends JpaRepository<Student, Integer> {


}
