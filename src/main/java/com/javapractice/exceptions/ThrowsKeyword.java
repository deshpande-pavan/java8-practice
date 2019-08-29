package com.javapractice.exceptions;

public class ThrowsKeyword {

	public int divison(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		ThrowsKeyword tk = new ThrowsKeyword();
		try {
			System.out.println(tk.divison(12, 5));
		} catch (ArithmeticException e) {
			System.out.println("divide by zero eror");
		}
	}

}
