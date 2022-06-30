package com.edu.HospitalManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.HospitalManagement.entity.Doctor;
import com.edu.HospitalManagement.exception.GivenIdNotFoundException;
import com.edu.HospitalManagement.exception.NoRecordFoundException;
import com.edu.HospitalManagement.repository.DoctorRepository;



@Service
public class DoctorServiceImpl implements DoctorService{
	
	DoctorRepository doctorRepository;
	
	
	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}
	

	@Override
	public Doctor saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getDoctorList() {
       List<Doctor> doctor =doctorRepository.findAll();
       if(doctor.isEmpty())
    	   throw new NoRecordFoundException();
       else
		return doctor;
	}

	@Override
	public Doctor getDoctorById(long id) {
    Optional<Doctor> doctor= doctorRepository.findById(id);
		
		if(doctor.isPresent())
			return doctor.get();
		else
			throw new GivenIdNotFoundException("Doctor", "Id", id);
	}
	
	@Override
	public Doctor updateDoctor(long id, Doctor doctor) {
Doctor dr =doctorRepository.findById(id).orElseThrow(()-> new GivenIdNotFoundException("Doctor","Id",id));
		
		dr.setFirstName(doctor.getFirstName());
		dr.setLastName(doctor.getLastName());
		dr.setAddress(doctor.getAddress());
		dr.setContactNo(doctor.getContactNo());
		dr.setQualification(doctor.getQualification());
		dr.setGender(doctor.getGender());
		dr.setGender(doctor.getAge());
		dr.setUserName(doctor.getUserName());
		dr.setPassword(doctor.getPassword());
		dr.setYearofExperience(doctor.getYearofExperience());
		dr.setSalary(doctor.getSalary());
		
		doctorRepository.save(dr);
		return dr;
	}
	
	@Override
	public String deleteDoctor(long id) {
		Doctor doctor= doctorRepository.findById(id).orElseThrow(()-> new GivenIdNotFoundException("Doctor","Id",id));
		doctorRepository.deleteById(id);;	
		return "Doctor Record Deleted Successfully";
		}


	@Override
	public List<Doctor> getDoctorByFirstName(String firstName) {
		
		return  doctorRepository.getByFirstName(firstName);
	}
	@Override
	public List<Doctor> getDoctorByLastName(String lastName) {
		
		return  doctorRepository.getByLastName(lastName);
	}


	@Override
	public List<Doctor> getDoctorByFullName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


