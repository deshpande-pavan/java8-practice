package com.javapractice.consumer;

import java.util.ArrayList;

class Employee {
	double salary;
	String name;

	public Employee(double salary, String name) {
		this.salary = salary;
		this.name = name;
	}
}

public class BiConsumer {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		populate(l);
		java.util.function.BiConsumer<Employee, Double> c = (e, d) -> e.salary = e.salary + d;
		for (Employee e : l) {
			c.accept(e, 100.0);
		}
		for (Employee e : l) {
			System.out.println("Employee Name: " + e.name);
			System.out.println("Employee salary: " + e.salary + "\n");
		}
	}

	private static void populate(ArrayList<Employee> l) {
		l.add(new Employee(1000, "pavan"));
		l.add(new Employee(2000, "Karan"));
		l.add(new Employee(3000, "pawan"));
		l.add(new Employee(4000, "ravan"));
	}

}
