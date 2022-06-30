package com.edu.HospitalManagement.service;

import java.util.List;

import com.edu.HospitalManagement.entity.Appointment;

public interface AppointmentService {

	List<Appointment> getAppointmentList();

	Appointment saveAppointment(Appointment appointment);

	Appointment updateAppointment(long id, Appointment appointment);

	String deleteAppointment(long id);

}
