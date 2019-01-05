package com.SpringBootH2Integration.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student {
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

	private String Student_code;
	
	public String getStudent_code() {
		return Student_code;
	}

	public void setStudent_code(String student_code) {
		Student_code = student_code;
	}
	
	 @Temporal(TemporalType.DATE)
	    
	    private Date dateOfBirth;
	 
	 
	

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {	
		return "Student [id=" + id + ", name=" + name +  ", student_code"+ Student_code+ ", dateofBirth"+ dateOfBirth+ "]";
	}

}
