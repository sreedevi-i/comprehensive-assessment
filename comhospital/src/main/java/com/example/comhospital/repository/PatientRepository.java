package com.example.comhospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.comhospital.model.Patient;
public interface PatientRepository extends JpaRepository<Patient,Long>{

}
