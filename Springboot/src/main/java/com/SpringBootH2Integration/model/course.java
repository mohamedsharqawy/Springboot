package com.SpringBootH2Integration.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class course {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
		
	public int getId() {
		return id;
	}

	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String Course_code;

	public String getCourse_code() {
		return Course_code;
	}

	public void setCourse_code(String course_code) {
		Course_code = course_code;
	}
	
	

}
