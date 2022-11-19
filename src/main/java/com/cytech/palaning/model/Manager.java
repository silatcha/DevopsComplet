package com.cytech.palaning.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manager extends User implements Serializable{

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long managerId;

	public Manager(String firstName, String email, int phone, String lastName, String password, String role,
			Long managerId) {
		super(firstName, email, phone, lastName, password, role);
		this.managerId = managerId;
	}

	public Long getStudentId() {
		return managerId;
	}
	
	
	
}
