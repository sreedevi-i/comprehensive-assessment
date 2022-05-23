package com.example.comhospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.comhospital.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> ,JpaSpecificationExecutor<Doctor>{

}
