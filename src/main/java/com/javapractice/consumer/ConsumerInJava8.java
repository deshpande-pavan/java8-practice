package com.javapractice.consumer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class ConsumerInJava8 {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Pavan");

		Function<Student, String> f2 = s1 -> {
			int marks = s1.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A";
			else if (marks >= 60)
				grade = "FC";
			else if (marks >= 50)
				grade = "SC";
			else if (marks >= 35)
				grade = "TC";
			else
				grade = "F";
			return grade;
		};

		Student[] s1 = { new Student("Pavan", 82), new Student("karan", 70), new Student("kiran", 40),
				new Student("ravan", 55), new Student("jack", 34) };
		Predicate<Student> p = s2 -> s2.marks >= 60;
		Consumer<Student> c1 = student -> {
			System.out.println("Student name: " + student.name);
			System.out.println("Student marks: " + student.marks);
			System.out.println("Student grade: " + f2.apply(student) + "\n");
		};

		for (Student student : s1) {
			if (p.test(student))
				c1.accept(student);
		}
	}
}
