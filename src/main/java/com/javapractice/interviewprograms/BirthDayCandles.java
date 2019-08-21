package com.javapractice.interviewprograms;

import java.util.Scanner;

public class BirthDayCandles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		int ans = birthdayCakeCandles(a);
		System.out.println(ans);
		sc.close();
	}

	private static int birthdayCakeCandles(int[] a) {
		int max = 0;
		int count = 0;

		for (int i : a) {
			if (i > max) {
				count = 1;
				max = i;
			} else if (i == max) {
				count++;
			}
		}
		return count;
	}

}
