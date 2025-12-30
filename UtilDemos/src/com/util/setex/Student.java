package com.util.setex;

import java.util.Objects;

public class Student implements Comparable<Student>{

	private String studentName;
	private int studentId;
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int studentId, String city) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.city = city;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(studentId, studentName);
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
		return studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}
	
	@Override
	public int compareTo(Student o) {
		return this.getStudentName().compareTo(o.getStudentName());
	}
	
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", city=" + city + "]";
	}
	
	
}
