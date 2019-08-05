package com.javapractice.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class EmployeeDetails {

	String name;
	double salary;

	public EmployeeDetails(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Employee {
	public static void main(String[] args) {
		ArrayList<EmployeeDetails> l = new ArrayList<>();
		l.add(new EmployeeDetails("Pavan", 1000));
		l.add(new EmployeeDetails("karan", 200055));
		l.add(new EmployeeDetails("pawan", 10040));
		l.add(new EmployeeDetails("karang", 204040));
		l.add(new EmployeeDetails("Pavan3", 10400));
		l.add(new EmployeeDetails("karanr", 2000));

		Predicate<EmployeeDetails> p = e -> e.salary > 3000;
		for (EmployeeDetails e : l) {
			if (p.test(e)) {
				System.out.println(e.name + " : " + e.salary);
			}
		}
	}
}
