package com.jspiders.jdbc_prepared_statement_crud_operation.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Student implements Serializable{
	private int id;
	private String name;
	private String email;
	private long phone;
	private LocalDate dob;
	private String gender;
	//alt+s+a parameterized and non-parameterized constructor
	
	/**
	 * This constructor we use to fetch details from database
	 */
	public Student(int id, String name, String email, long phone, LocalDate dob, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;
	}
	
	/**
	 * 
	 * @param name
	 * @param email
	 * @param phone
	 * @param dob
	 * @param gender
	 * This constructor is used for insertion of data in database
	 */
	
	
	public Student(String name, String email, long phone, LocalDate dob, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;
	}



	public Student() {
		super();
		
    // alt+s+r to generate getter and setter method
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	//to generate toString() ---- Alt+SHIFT+S+S+A
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob + ", gender="+ gender+"]";
	}
	
	//to generate hashcode() and equals() method ----alt+shift+s+h
	@Override
	public int hashCode() {
		return Objects.hash(dob, email, id, name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name) && phone == other.phone;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
