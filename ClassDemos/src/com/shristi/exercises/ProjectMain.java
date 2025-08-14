package com.shristi.exercises;

public class ProjectMain {

	public static void main(String[] args) {
		Project project = new Project();
		// the method returns a array
		String[] courses = project.showCourses();
		// iterate thru the array
		for (String course : courses)
			System.out.println(course);
		System.out.println();
		
		String[] tools = project.showTools();
		for (String tool : tools) {
			System.out.println(tool);
		}
		System.out.println();
		String[] techStack = new String[] {"react","spring","docker","mysql"};
		project.printSoftwares(techStack);
		
	}
		
		
	}