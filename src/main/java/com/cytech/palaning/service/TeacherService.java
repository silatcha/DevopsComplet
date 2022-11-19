package com.cytech.palaning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cytech.palaning.dao.DisponibilityRepository;
import com.cytech.palaning.dao.TeacherRepository;
import com.cytech.palaning.model.Teacher;
import com.cytech.palaning.model.school.Disponibility;

@Service
public class TeacherService {

	
	@Autowired
	private final TeacherRepository teacherRepo;
	@Autowired
	DisponibilityRepository dispo;
	
	@Autowired
	public TeacherService(TeacherRepository teacherRepo)
	{
		
		this.teacherRepo= teacherRepo;
		
		
	}
	
	public Teacher addTeacher(Teacher teacher,List<Disponibility> dispo) {
		
		
		Teacher newTeacher =this.teacherRepo.save(teacher);
		
		for(Disponibility d : newTeacher.getDisponibility(dispo)) {
			this.dispo.save(d);
		}
		
		return newTeacher;
		
	}
	
    public List<Teacher> findAllTeacher() {
		
		return this.teacherRepo.findAll();
	}
    
public Teacher findStudentByTeacherId(Long teacherId) {
		
		return this.teacherRepo.findStudentByTeacherId(teacherId);
	}

    public Teacher updateTeacher(Teacher teacher) {
		
		return this.teacherRepo.save(teacher);
	}
    
    public void deleteTeacher(Long teacherId) {
		
		 this.teacherRepo.deleteStudentByTeacherId(teacherId);
	}
}
