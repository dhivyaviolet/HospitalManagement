package com.edu.HospitalManagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.HospitalManagement.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

}


