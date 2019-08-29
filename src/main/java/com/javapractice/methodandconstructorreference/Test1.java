package com.javapractice.methodandconstructorreference;

interface Interf1 {
	SampleTest get(String s, int i);
}

class SampleTest {
	public SampleTest() {
		System.out.println("No arg constructor");
	}

	public SampleTest(int i) {
		System.out.println("int arg constructor " + i);
	}

	public SampleTest(String s, int i) {
		System.out.println("String int arg constructor" + s + " " + i);
	}

}

public class Test1 {

	public static void main(String[] args) {
		Interf1 i = SampleTest::new;
		i.get("Pavan", 5);
	}

}