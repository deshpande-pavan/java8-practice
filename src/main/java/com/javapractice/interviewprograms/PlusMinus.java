package com.javapractice.interviewprograms;

import java.util.Scanner;

public class PlusMinus {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		int cp = 0;
		int cn = 0;
		int z = 0;
		int arSize = arr.length;
		for (int i : arr) {
			if (i < 0)
				cn++;
			else if (i > 0)
				cp++;
			else
				z++;
		}
		System.out.println(cp / (float) arSize);
		System.out.println(cn / (float) arSize);
		System.out.println(z / (float) arSize);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
