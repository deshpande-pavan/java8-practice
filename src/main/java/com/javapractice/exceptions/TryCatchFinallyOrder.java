package com.javapractice.exceptions;

public class TryCatchFinallyOrder {

	public static void main(String[] args) {
		try {
			System.out.println("test");
			System.out.println("testbeofer");
			int a = 10 / 0;
			System.out.println(a);
			System.out.println("testAFter");
			System.out.println("test");
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero error");
		} finally {
			System.out.println("in finally");
		}
		System.out.println("After finally");
		

	}

}
