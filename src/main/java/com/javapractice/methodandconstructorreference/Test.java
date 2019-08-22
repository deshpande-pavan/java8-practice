package com.javapractice.methodandconstructorreference;

interface Interf {
	public Sample m1();
}

class Sample {
	public Sample() {
		System.out.println("Sample Constructor");
	}

	public void info() {
		System.out.println("Sample class method");
	}
}

public class Test {

	public static void main(String[] args) {
		Interf f = () -> new Sample();
		f.m1().info();
		
		Interf i= Sample::new;
		i.m1().info();
	}

}
