package com.example.comhospital.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class Patient{
	public Patient()
	{
		
	}
public Patient(long id, String name, int age, String gender, String visitedDoctor, Date dov) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.visited_doctor = visitedDoctor;
		this.dov = dov;
	}
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
@Column(name="name")	
private String name;
@Column(name="age")
private int age;
@Column(name="gender")
private String gender;
@Column(name="visited_doctor")
private String visited_doctor;
@Column(name="dov")
private Date dov;
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

public String getVisited_doctor() {
	return visited_doctor;
}
public void setVisited_doctor(String visited_doctor) {
	this.visited_doctor = visited_doctor;
}
public Date getDov() {
	return dov;
}
public void setDov(Date dov) {
	this.dov = dov;
}

}