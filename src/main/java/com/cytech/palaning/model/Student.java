package com.cytech.palaning.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cytech.palaning.model.school.Speciality;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Student extends User implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	@JsonProperty("studentId")
	private Long studentId;
	@JsonProperty("schoolYear")
	private int schoolYear;
	@JsonProperty("specialityId")
	@Column(nullable = false)
	private Long specialityId;

	

	public Student(
			Long studentId, int schoolYear, Long specialityId) {
		super();
		this.studentId = studentId;
		this.schoolYear = schoolYear;
		this.specialityId = specialityId;
	}
	public Student() {
			
		super();
		
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
