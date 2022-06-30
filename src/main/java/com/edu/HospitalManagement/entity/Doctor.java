package com.edu.HospitalManagement.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctorTbl")
public class Doctor {
	
	@Id


	private String doctorId;
	@Column(name="first_Name")
	private String firstName;
	@Column(name="last_Name")
	private String lastName;
	private double salary;
	private String address;
	private long contactNo;
	private String gender;
	private String age;
	private String qualification;
	private String yearofExperience;
	private String userName;
	private String password;
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getYearofExperience() {
		return yearofExperience;
	}
	public void setYearofExperience(String yearofExperience) {
		this.yearofExperience = yearofExperience;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Doctor(String doctorId, String firstName, String lastName, double salary, String address, long contactNo,
			String gender, String age, String qualification, String yearofExperience, String userName,
			String password) {
		super();
		this.doctorId = doctorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.address = address;
		this.contactNo = contactNo;
		this.gender = gender;
		this.age = age;
		this.qualification = qualification;
		this.yearofExperience = yearofExperience;
		this.userName = userName;
		this.password = password;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary="
				+ salary + ", address=" + address + ", contactNo=" + contactNo + ", gender=" + gender + ", age=" + age
				+ ", qualification=" + qualification + ", yearofExperience=" + yearofExperience + ", userName="
				+ userName + ", password=" + password + "]";
	
	
}
	public Object getYearsofExperience() {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	
	
	
	
	
	
	

	


