package com.util.funex;

public class Course {

	private String coursename;
	private int courseId;
	private String type;
	private double cost;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String coursename, int courseId, String type, double cost) {
		super();
		this.coursename = coursename;
		this.courseId = courseId;
		this.type = type;
		this.cost = cost;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Course [coursename=" + coursename + ", courseId=" + courseId + ", type=" + type + ", cost=" + cost
				+ "]";
	}
	
	
	
}
