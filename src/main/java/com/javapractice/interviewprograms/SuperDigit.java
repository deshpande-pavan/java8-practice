package com.javapractice.interviewprograms;

import java.util.Scanner;

public class SuperDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rep = sc.nextInt();
		StringBuilder str = new StringBuilder(num);
		for (int i = 0; i < rep; i++) {
			str.append(num);
		}
		int number = Integer.parseInt(str.toString());
		System.out.println(superDigit(number));
		sc.close();
	}

	private static int superDigit(int num) {
		int sum = 0;
		do {
			sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			num = sum;
		} while (sum > 9);
		return sum;
	}

}
