package com.learning.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springboot.model.Employer;

public interface EmployerRepository extends JpaRepository<Employer, Integer>{

}
