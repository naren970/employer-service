package com.learning.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.model.Employer;
import com.learning.springboot.repository.EmployerRepository;

@RestController
public class EmployerController {

	@Autowired
	EmployerRepository employerRepo;
	
	
	@GetMapping("/employer")
	public List<Employer> getEmployers(){
		System.out.println("In side Employeer");
		return employerRepo.findAll(); 
	}
	
	@PostMapping("/employer")
	public Employer addEmployer(@RequestBody Employer employerDetails) {
		
		return employerRepo.save(employerDetails);
		
		
	}
	
	@GetMapping("/employer/{id}")
	public Optional<Employer> getEmployer(@PathVariable int id) {
		return employerRepo.findById(id);
	}
}
