package com.edu.HospitalManagement.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.HospitalManagement.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{

	List<Doctor> getByFirstName(String firstName);

	List<Doctor> getByLastName(String lastName);

}


