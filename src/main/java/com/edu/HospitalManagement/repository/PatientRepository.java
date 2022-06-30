package com.edu.HospitalManagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.edu.HospitalManagement.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}



