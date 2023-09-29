package com.cytech.palaning.model.school;

import java.sql.Time;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Disponibility {
	
	@Id @GeneratedValue
	@JsonProperty("dispoId")
	private Long dispoId;
	@JsonProperty("listHour")
	private ArrayList<Time>  listHour;
	@JsonProperty("day")
	private String day;
	@JsonProperty("teacherId")
	private Long teacherId;
	
	
	
	public Disponibility(ArrayList<Time> listHour, String day) {
		
		this.listHour = listHour;
		this.day = day;
	}
	
public Disponibility() {}


	public ArrayList<Time> getListHour() {
		return listHour;
	}


	public void setListHour(ArrayList<Time> listHour) {
		this.listHour = listHour;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public Long getDispoId() {
		return dispoId;
	}


	public Long getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}
	
	

}
