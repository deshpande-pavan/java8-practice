package com.javapractice.generics;

public class Generics1 {

	public static void main(String[] args) {

		Test<String, Integer> t = new Test<>("GFG", 1);
		System.out.println(t.obj1 + " " + t.obj2);
	}

}

class Test<T, U> {
	T obj1;
	U obj2;

	Test(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
}
