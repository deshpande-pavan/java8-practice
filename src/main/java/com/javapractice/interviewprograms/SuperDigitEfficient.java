package com.javapractice.interviewprograms;

import java.util.Scanner;

public class SuperDigitEfficient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int times = sc.nextInt();
		String concat = Integer.toString(num);
		for (int i = 0; i < times - 1; i++) {
			concat = concat + Integer.toString(num);
		}
		System.out.println(superDigit(Integer.parseInt(concat)));
		sc.close();
	}

	private static int superDigit(int parseInt) {

		if (parseInt == 0)
			return 0;
		else if (parseInt % 9 == 0)
			return 9;
		else
			return parseInt % 9;
	}

}
