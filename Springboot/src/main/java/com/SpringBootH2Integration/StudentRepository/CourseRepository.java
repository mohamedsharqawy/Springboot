package com.SpringBootH2Integration.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.SpringBootH2Integration.model.course;

public interface CourseRepository extends JpaRepository<course, Integer> {

}
