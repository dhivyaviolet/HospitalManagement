package com.edu.HospitalManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.HospitalManagement.entity.Patient;
import com.edu.HospitalManagement.exception.GivenIdNotFoundException;
import com.edu.HospitalManagement.repository.PatientRepository;


@Service
public class PatientServiceImpl implements PatientService {

	
	
	@Autowired
	PatientRepository patientRepository;

	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}
	
	@Override
	public List<Patient> getPatientList() {
		// TODO Auto-generated method stub
		return  patientRepository.findAll();
	}

	@Override
	public Patient updatePatient(long id, Patient patient) {
		Patient pat=patientRepository.findById(id).orElseThrow(()-> new GivenIdNotFoundException("Patient","id",id));
		 
		 patientRepository.save(pat);
			return pat;
		}

	@Override
	public String deletePatient(long id) {
		Patient patient=patientRepository.findById(id).orElseThrow(()-> new GivenIdNotFoundException("Patient","id",id));
		
		patientRepository.deleteById(id);
		return "Patient Record Deleted Successfully";
	}
	
	
}


	




