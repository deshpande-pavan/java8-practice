package com.javapractice.generics;

public class Generics2 {
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + " " + element);
	}

	public static void main(String[] args) {
		genericDisplay(1);
		genericDisplay("pavan");
		genericDisplay(1.0);
	}

}
