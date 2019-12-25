package com.javapractice.interviewprograms;

import java.util.Scanner;

public class FindNumberAtPosInFibonacciRecursive {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		System.out.println(fib(pos));
		sc.close();
	}

	private static int fib(int pos) {
		if (pos < 2) {
			return pos;
		} else {
			return fib(pos - 1) + fib(pos - 2);
		}
	}

}
