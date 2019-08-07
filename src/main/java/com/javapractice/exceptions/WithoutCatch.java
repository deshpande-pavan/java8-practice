package com.javapractice.exceptions;

public class WithoutCatch {

	public static void main(String[] args) {
		try {
			System.out.println("test");
			System.out.println("test");
			System.out.println("test");
			System.out.println("test");
			System.out.println("test");
			int a = 10;
			int b = a / 0;
			System.out.println(b);
			System.out.println("test");
			System.out.println("test");
			System.out.println("test");

		} finally {
			System.out.println("in finally");
		}
	}

}
