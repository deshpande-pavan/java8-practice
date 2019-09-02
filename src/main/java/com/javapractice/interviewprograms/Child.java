package com.javapractice.interviewprograms;

class Parent {
	int a = 5;

	public void print() {
		System.out.println("In parent class " + a);
	}

	public static void display() {
		System.out.println("parent method class");

	}
}

public class Child extends Parent {
	int a = 10;

	public void print() {
		System.out.println("In child class " + a);
	}

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent c = new Child();
		p1.print();
		c.print();
		Child.display();
		System.out.println(c.a);
	}

	public static void display() {
		System.out.println("child method class");
	}
}
