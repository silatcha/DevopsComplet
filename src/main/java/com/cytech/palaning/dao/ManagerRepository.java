package com.cytech.palaning.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cytech.palaning.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

}
