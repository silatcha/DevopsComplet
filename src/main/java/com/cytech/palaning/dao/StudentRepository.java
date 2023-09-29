package com.cytech.palaning.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cytech.palaning.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

	void deleteStudentByStudentId(Long studentId);

	Student findStudentByStudentId(Long studentId);

}
