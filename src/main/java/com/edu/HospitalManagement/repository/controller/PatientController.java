package com.edu.HospitalManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.HospitalManagement.entity.Patient;
import com.edu.HospitalManagement.service.PatientService;

@RestController
@RequestMapping("/api/patient")

public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	
	@GetMapping
	public List<Patient> getPatientList(){
		return patientService.getPatientList();
	}

}



	


