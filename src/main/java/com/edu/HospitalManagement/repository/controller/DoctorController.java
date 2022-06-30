package com.edu.HospitalManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.HospitalManagement.entity.Doctor;
import com.edu.HospitalManagement.service.DoctorService;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	
	 @Autowired
	 DoctorService  doctorService;
	 
	 //
	    @PostMapping
	    public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor doctor) {
		return  new ResponseEntity<Doctor>(doctorService.saveDoctor(doctor), HttpStatus.CREATED);
		
	}
	
	  @GetMapping
	    public List<Doctor> getDoctorList() {
		return doctorService.getDoctorList();
		
	}
	  
	  @GetMapping("/{id}")
	 public Doctor getDoctorById(@PathVariable("id") long id) { // 101
		return doctorService.getDoctorById(id);
		  
	  }
	
	
	

}







