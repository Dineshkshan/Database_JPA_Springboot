package com.database.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Student",schema="test")
public class Student 
{
	@Id
	private int id;
	private String Studentname;
	private String Studentsubject;
	private int marks;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public String getStudentsubject() {
		return Studentsubject;
	}

	public void setStudentsubject(String studentsubject) {
		Studentsubject = studentsubject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
    
	public Student(String studentname, String studentsubject, int marks) {
		super();
		Studentname = studentname;
		Studentsubject = studentsubject;
		this.marks = marks;
	}

	public Student() {
	}
    
}
