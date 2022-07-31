package com.pms.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	 private long id;
	 private String name;
	 private String college;
	 private long roll;
	 private String qualification;
	 private String course;
	 private int year;
	 private String certificate;
	 private long hallTicketNo;
	 
	 	 
public Student() {
		 
	 }


public Student(long id, String name, String college, long roll, String qualification, String course, int year,
		String certificate, long hallTicketNo) {
	super();
	this.id = id;
	this.name = name;
	this.college = college;
	this.roll = roll;
	this.qualification = qualification;
	this.course = course;
	this.year = year;
	this.certificate = certificate;
	this.hallTicketNo = hallTicketNo;
}


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	 

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


public String getCollege() {
	return college;
}


public void setCollege(String college) {
	this.college = college;
}


public long getRoll() {
	return roll;
}


public void setRoll(long roll) {
	this.roll = roll;
}


public String getQualification() {
	return qualification;
}


public void setQualification(String qualification) {
	this.qualification = qualification;
}


public String getCourse() {
	return course;
}


public void setCourse(String course) {
	this.course = course;
}


public int getYear() {
	return year;
}


public void setYear(int year) {
	this.year = year;
}


public String getCertificate() {
	return certificate;
}


public void setCertificate(String certificate) {
	this.certificate = certificate;
}


public long getHallTicketNo() {
	return hallTicketNo;
}


public void setHallTicketNo(long hallTicketNo) {
	this.hallTicketNo = hallTicketNo;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", college=" + college + ", roll=" + roll + ", qualification="
			+ qualification + ", course=" + course + ", year=" + year + ", certificate=" + certificate
			+ ", hallTicketNo=" + hallTicketNo + "]";
}






	
		
	
	
	
  
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
