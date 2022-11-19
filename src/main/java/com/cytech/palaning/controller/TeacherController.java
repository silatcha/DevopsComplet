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
import com.cytech.palaning.model.Teacher;
import com.cytech.palaning.model.school.Disponibility;
import com.cytech.palaning.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	
	private final TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Teacher>> getAllStudent(){
		
		List<Teacher> teacher = this.teacherService.findAllTeacher();
		
		return new ResponseEntity<>(teacher,HttpStatus.OK);
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Teacher> getStudent(@PathVariable("id") Long teacheId){
		
		Teacher teacher = this.teacherService.findStudentByTeacherId(teacheId);
		
		return new ResponseEntity<>(teacher,HttpStatus.OK);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Teacher> saveStudent(@RequestBody Teacher teacher,@RequestBody List<Disponibility> dispo){
		
		Teacher newTeacher = this.teacherService.addTeacher(teacher,dispo);
		
		return new ResponseEntity<>(newTeacher,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Teacher> updateStudent(@RequestBody Teacher teacher){
		
		Teacher newTeache = this.teacherService.updateTeacher(teacher);
		
		return new ResponseEntity<>(newTeache,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable("id") Long teacherId){
		
		this.teacherService.deleteTeacher(teacherId);
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
