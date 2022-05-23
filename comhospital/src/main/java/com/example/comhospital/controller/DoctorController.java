package com.example.comhospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comhospital.model.Doctor;
import com.example.comhospital.repository.DoctorRepository;
@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping("/")
public class DoctorController {
@Autowired
private DoctorRepository docRepository;
@GetMapping("doctors")
public List<Doctor> getAllDoctors()
{
	return docRepository.findAll();
}
}
