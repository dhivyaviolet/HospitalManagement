package com.edu.HospitalManagement.service;


import java.util.List;

import com.edu.HospitalManagement.entity.Patient;

public interface PatientService {

	List<Patient> getPatientList();

	Patient savePatient(Patient patient);

	Patient updatePatient(long id, Patient patient);

	String deletePatient(long id);

}

