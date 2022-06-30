package com.edu.HospitalManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.HospitalManagement.entity.Appointment;
import com.edu.HospitalManagement.service.AppointmentService;

@RestController
@RequestMapping("/api/appointment")

public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	
	@GetMapping
	public List<Appointment> getAppointmentList(){
		return appointmentService.getAppointmentList();
	}

}






