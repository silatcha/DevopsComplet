package com.cytech.palaning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cytech.palaning.Exception.StudentException;
import com.cytech.palaning.dao.StudentRepository;
import com.cytech.palaning.model.Student;


@Service
public class StudentService {
	
	@Autowired
	private final StudentRepository studentRepo;
	
	@Autowired
	public StudentService(StudentRepository studentRepo)
	{
		
		this.studentRepo= studentRepo;
		
	}
	
	public Student addStudent(Student student) {
		
		return this.studentRepo.save(student);
	}
	
    public List<Student> findAllStudent() {
		
		return this.studentRepo.findAll();
	}
    
public Student findStudentBySutendId(Long studentId) {
		
		return this.studentRepo.findStudentByStudentId(studentId);
	}

    public Student updateStudent(Student student) {
		
		return this.studentRepo.save(student);
	}
    
    public void deleteStudent(Long studentId) {
		
		 this.studentRepo.deleteStudentByStudentId(studentId);
	}
    
}
