package com.example.comhospital.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.comhospital.model.Patient;
import com.example.comhospital.repository.PatientRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class PatientController {
	@Autowired
	private PatientRepository patRepository;
	@GetMapping("/patients")
	public List<Patient> getAllPatients()
	{
		return patRepository.findAll();
		
	}
	
	@PostMapping("/patients")
	public Patient createPatient(@RequestBody Patient p) {
		return patRepository.save(p);
	}
}
