package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
public College() {
	
}

public College(long id, String collegeAdmin, String collegeName, String location) {
		super();
		this.id = id;
		this.collegeAdmin = collegeAdmin;
		this.collegeName = collegeName;
		this.location = location;
	}
private long id;
private String collegeAdmin;
private String collegeName;
private String location;

@Id
@GeneratedValue( strategy = GenerationType.AUTO)
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getCollegeAdmin() {
	return collegeAdmin;
}
public void setCollegeAdmin(String collegeAdmin) {
	this.collegeAdmin = collegeAdmin;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}


}



