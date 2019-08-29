package com.javapractice.interviewprograms;

class Parent {
	static int a = 10;

	public void print() {
		System.out.println("In parent class " + a);
	}
}

public class Child extends Parent {
	static int a = 20;

	public void print() {
		System.out.println("In child class " + a);
	}

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Child();
		Child c = new Child();

		p1.print();
		p2.print();
//		c.print2();
		c.print();
	}

}
