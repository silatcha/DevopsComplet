package com.cytech.palaning.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cytech.palaning.model.Manager;
import com.cytech.palaning.service.ManagerService;

@RestController
@RequestMapping("/manager")
public class ManagerController {
	
	private final ManagerService managerService;

	public ManagerController(ManagerService managerService) {
		
		this.managerService = managerService;
	}
	

	@GetMapping("/all")
	public ResponseEntity<List<Manager>> getAllManager(){
		
		List<Manager> manager = this.managerService.findAllManager();
		
		return new ResponseEntity<>(manager,HttpStatus.OK);
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Manager> getStudent(@PathVariable("id") Long managerId){
		
		Manager manager = this.managerService.findStudentByManagerId(managerId);
		
		return new ResponseEntity<>(manager,HttpStatus.OK);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Manager> saveManager(@RequestBody Manager manager){
		
		Manager newManager = this.managerService.addManager(manager);
		
		return new ResponseEntity<>(newManager,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Manager> updateManager(@RequestBody Manager manager){
		
		Manager newManager = this.managerService.updateManager(manager);
		
		return new ResponseEntity<>(newManager,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable("id") Long managerId){
		
		this.managerService.deleteManager(managerId);
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	

}
