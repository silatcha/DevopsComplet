package com.cytech.palaning.service;

import org.springframework.stereotype.Service;

import com.cytech.palaning.dao.DisponibilityRepository;
import com.cytech.palaning.model.school.Disponibility;

@Service
public class DispoService {

	
	private final DisponibilityRepository dispo;

	public DispoService(DisponibilityRepository dispo) {
		
		this.dispo = dispo;
	}
	
	
	public Disponibility addDispo(Disponibility dispo) {
		
		return this.dispo.save(dispo);
	}
	
}
