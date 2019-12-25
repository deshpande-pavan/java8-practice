package com.javapractice.interviewprograms;

import java.util.Scanner;

public class FindNumberAtPosInFibonacciIterative {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		System.out.println(fib(pos));
		sc.close();
	}

	private static int fib(int pos) {
		int last = 0;
		int slast = 0;
		if (pos < 2) {
			return pos;
		} else {
			slast = 0;
			last = 1;
			int currPos = 2;
			while (currPos <= pos) {
				int temp = last;
				last = slast + last;
				slast = temp;
				currPos++;
			}
		}
		return last;
	}

}
