package com.util.funex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunUserDemo {

	public static void main(String[] args) {
//		Consumer<String> con  = str ->System.out.println("Welcome "+str.toUpperCase());
//		con.accept("Sri");
		
		Consumer<Course> con = course->System.out.println(course.getCoursename());
		con.accept(new Course("Java",1,"backend",2000));
		
		Supplier<Course> sup = ()->new Course("Python", 2, "backend", 1000);
		System.out.println(sup.get());
		
		Predicate<Course> pred = course->course.getCost()>2000;
		System.out.println(pred.test(new Course("Python", 2, "backend", 1000)));
		
		Function<Course,Double> fun= course->{
			return course.getCost();
		};
		double cost = fun.apply(new Course("Java",1,"backend",2000));
		System.out.println(cost);
		
		Function<Course,String> fun1 = course->course.getCoursename();
		System.out.println(fun1.apply(new Course("Java",1,"backend",2000)));
		
		
		List<String> fruits = Arrays.asList("apple","orange","kiwi");
		Function<List<String>,String> funfruit = list->{
			for(String fruit:list) {
				if(fruit.startsWith("K"))
					return fruit;
			}
			return "not available";
		};
		String val = funfruit.apply(fruits);
		System.out.println(val);
		
		List<Course> courses = Arrays.asList(
				new Course("Java",1,"backend",2000),
				new Course("Python",2,"backend",2000),
				new Course("Spring",3,"backend",2000)
				);
		
		
		Function<List<Course>,Course> funcourses = lcourses->{
			for (Course course : lcourses) {
				if(course.getCourseId()==1) return course;
			}
			return null;
		};
		Course course = funcourses.apply(courses);
		System.out.println(course);
		
		
		Function<List<Course>, List<String>> funstr = ncourses->{
			//create a temp list
			List<String> cnames = new ArrayList<>();
			for (Course ncourse : ncourses) {
				//add coursename to the list
				cnames.add(ncourse.getCoursename());
			}
			return cnames;
		};
		
		List<String> conames =  funstr.apply(courses);
		System.out.println(conames);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
