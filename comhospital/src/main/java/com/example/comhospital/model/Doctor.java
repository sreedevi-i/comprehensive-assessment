package com.example.comhospital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
public class Doctor {
	
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
@Column(name="name")	
private String name;
@Column(name="age")
private int age;
@Column(name="gender")
private String gender;
@Column(name="specialization")
private String specialization;
private static int totalappointments=0;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public int getTotalappointments() {
	return totalappointments;
}
public void setTotalappointments(int totalappointments) {
	this.totalappointments = totalappointments;
}
public Doctor(long id, String name, int age, String gender, String specialization) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.specialization = specialization;
}

public Doctor()
{
	
}


}

