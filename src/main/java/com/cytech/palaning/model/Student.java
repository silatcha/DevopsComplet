package com.cytech.palaning.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cytech.palaning.model.school.Speciality;

@Entity
public class Student extends User implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long studentId;
	private int schoolYear;
	@Column(nullable = false)
	private Long specialityId;

	

	public Student(String firstName, String email, int phone, String lastName, String password, String role,
			Long studentId, int schoolYear, Long specialityId) {
		super(firstName, email, phone, lastName, password, role);
		this.studentId = studentId;
		this.schoolYear = schoolYear;
		this.specialityId = specialityId;
	}

	public int getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}

	public Long getSpeciality() {
		return specialityId;
	}


	public Long getStudentId() {
		return studentId;
	}
	
	
	
	

}
