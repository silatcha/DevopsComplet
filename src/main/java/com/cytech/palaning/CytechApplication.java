package com.cytech.palaning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cytech.palaning.dao.StudentRepository;
import com.cytech.palaning.service.StudentService;



@SpringBootApplication
@EnableJpaRepositories(basePackageClasses
	    = {
	        StudentService.class, StudentRepository.class
	    })
public class CytechApplication {

	public static void main(String[] args) {
		SpringApplication.run(CytechApplication.class, args);
	}

}
