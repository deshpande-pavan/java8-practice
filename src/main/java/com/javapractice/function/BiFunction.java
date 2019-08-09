package com.javapractice.function;

import java.util.ArrayList;

class Employee {
	int empNo;
	String name;

	public Employee(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}
}

public class BiFunction {

	public static void main(String[] args) {
		java.util.function.BiFunction<Integer, String, Employee> bf = (enpNo, name) -> new Employee(enpNo, name);
		Employee e1 = bf.apply(10, "Pavan");
		System.out.println(e1.empNo + " " + e1.name);

		ArrayList<Employee> l = new ArrayList<>();
		java.util.function.BiFunction<Integer, String, Employee> b = (eno, name) -> new Employee(eno, name);
		l.add(b.apply(1, "pavan"));
		l.add(b.apply(2, "Karan"));
		l.add(b.apply(4, "Kiran"));
		l.add(b.apply(3, "Ravan"));
		l.add(b.apply(5, "Kedar"));
		for (Employee e : l) {
			System.out.println("Employee Number " + e.empNo);
			System.out.println("Employee Name " + e.name+"\n..................");
		}
	}

}
