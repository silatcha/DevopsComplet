package com.cytech.palaning.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cytech.palaning.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
	
	void deleteStudentByTeacherId(Long teacherId);

	Teacher findStudentByTeacherId(Long teacherId);

}
