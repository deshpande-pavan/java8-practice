package com.javapractice.overloading;

public class OverLoading {

	public static void main(String[] args) {
		Test t = new Test();
		t.display(10);
		t.display('a');
	}

}

class Test {
	public void display(int a) {
		System.out.println("int a : " + a);
	}

	public void display(int a, float b) {
		System.out.println("int a, float b");
	}
}
