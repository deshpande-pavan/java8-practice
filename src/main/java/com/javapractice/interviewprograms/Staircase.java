package com.javapractice.interviewprograms;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		staircase(n);
		scanner.close();
	}

	private static void staircase(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j>n-i?"#":" ");
			}
			
				System.out.println(" ");
			
		}
	}

}
