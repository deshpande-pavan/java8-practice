package com.javapractice.methodandconstructorreference;

interface Interf {
	public Sample m1(String s);
}

class Sample {
	private String s;

	public Sample(String s) {
		this.s = s;
	}

	public void info() {
		System.out.println("Your provided input is " + s);
	}
}

public class Test {

	public static void main(String[] args) {
//		Interf f = () -> new Sample();
//		f.m1().info();

//		Interf i = (s) -> new Sample(s);
		Interf i1 = Sample::new;
		i1.m1("Pawer").info();
//		Sample s1 = i.m1("Pawan");
//		s1.info();
//		i.m1("Pavan").info();
	}

}
