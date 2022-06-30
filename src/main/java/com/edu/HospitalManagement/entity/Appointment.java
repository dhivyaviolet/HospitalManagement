package com.edu.HospitalManagement.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="appointementTb1")
public class Appointment {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	 private int id;
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	    private String appointement;
	    private String patientName;
	    private int age;
	    private String Gender;
	    private String disease;
	    private Date date;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAppointement() {
			return appointement;
		}
		public void setAppointement(String appointement) {
			this.appointement = appointement;
		}
		public String getPatientName() {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return Gender;
		}
		public void setGender(String gender) {
			Gender = gender;
		}
		public String getDisease() {
			return disease;
		}
		public void setDisease(String disease) {
			this.disease = disease;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public Appointment() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Appointment(int id, String appointement, String patientName, int age, String gender, String disease,
				Date date) {
			super();
			this.id = id;
			this.appointement = appointement;
			this.patientName = patientName;
			this.age = age;
			Gender = gender;
			this.disease = disease;
			this.date = date;
		}
		@Override
		public String toString() {
			return "Appointement [id=" + id + ", appointement=" + appointement + ", patientName=" + patientName
					+ ", age=" + age + ", Gender=" + Gender + ", disease=" + disease + ", date=" + date + "]";
		}
}

