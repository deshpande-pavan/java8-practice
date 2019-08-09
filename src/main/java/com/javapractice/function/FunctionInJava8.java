package com.javapractice.function;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

class Student {
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class FunctionInJava8 {

	public static void main(String[] args) {
		ToIntFunction<String> f = i -> i.length();
		System.out.println(f.applyAsInt("Pavan"));

		UnaryOperator<String> f1 = s -> s.toUpperCase();
		String s = f1.apply("pavan");
		System.out.println(s);

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
		System.out.println(f2.apply(new Student("Pavan", 7)));

		Student[] s1 = { new Student("Pavan", 82), new Student("karan", 70), new Student("kiran", 40),
				new Student("ravan", 55), new Student("jack", 34) };
		Predicate<Student> p = s2 -> s2.marks >= 60;
		for (Student student : s1) {
			if (p.test(student)) {
				System.out.println("Student name: " + student.name);
				System.out.println("Student marks: " + student.marks);
				System.out.println("Student grade: " + f2.apply(student) + "\n");

			}
		}

		Function<Integer, Integer> f3 = i -> 2 * i;
		Function<Integer, Integer> f4 = i -> i * i * i;
		System.out.println(f3.andThen(f4).apply(2));
		System.out.println(f3.compose(f4).apply(2));
	}

}
