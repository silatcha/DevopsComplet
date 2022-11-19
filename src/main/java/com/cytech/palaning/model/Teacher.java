package com.cytech.palaning.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cytech.palaning.model.school.Disponibility;

@Entity
public class Teacher extends User implements Serializable {

	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long teacherId;
	
	//private List<Disponibility> disponibility;

	public Teacher(String firstName, String email, int phone, String lastName, String password, String role,
			Long teacherId) {
		super(firstName, email, phone, lastName, password, role);
		this.teacherId = teacherId;
		
	}



	



	public Long getTeacherId() {
		return teacherId;
	}



	public List<Disponibility> getDisponibility(List<Disponibility> dispo) {
		
		for(Disponibility d: dispo) {
			d.setTeacherId(this.teacherId);
		}
		
		return dispo;
	}


	
	
	
	
}
