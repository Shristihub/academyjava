package com.oops.inher1;

public class Institute {

	public static void main(String[] args) {
		Courses courses = new Courses();
		String[] coursesTaught=courses.showCourses();
		for (String course : coursesTaught) {
			System.out.println("Parent");
			System.out.println(course);
		}
		System.out.println();
		WebDevelopment webDev = new WebDevelopment();
		//own method
		String[] details = webDev.courseDetails();
		for (String detail : details) {
			System.out.println(detail);
		}
		System.out.println();
		System.out.println("Courses Taught");
		
		for (String course : webDev.showCourses()) {
			System.out.println(course);
		}
		System.out.println();
		CloudComputing computing =  new CloudComputing();
		computing.toolsUsed("Jenkins","GIT","Maven");
		
	}

}












