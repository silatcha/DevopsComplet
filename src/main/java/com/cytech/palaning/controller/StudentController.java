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

import com.cytech.palaning.model.Student;
import com.cytech.palaning.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudent(){
		
		List<Student> student = this.studentService.findAllStudent();
		
		return new ResponseEntity<>(student,HttpStatus.OK);
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") Long studentId){
		
		Student student = this.studentService.findStudentBySutendId(studentId);
		
		return new ResponseEntity<>(student,HttpStatus.OK);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		Student newStudent = this.studentService.addStudent(student);
		
		return new ResponseEntity<>(newStudent,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		
		Student newStudent = this.studentService.addStudent(student);
		
		return new ResponseEntity<>(newStudent,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable("id") Long studentId){
		
		this.studentService.deleteStudent(studentId);
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}
