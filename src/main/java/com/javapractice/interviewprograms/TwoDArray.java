package com.javapractice.interviewprograms;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println(arr[i][j] + " " + ++count);
			}
		}
		int max = maxSumHourGlass(arr);
		System.out.println("Answer is " + max);
		sc.close();
	}

	private static int maxSumHourGlass(int[][] arr) {
		int rows = arr.length - 2;
		int cols = arr[0].length - 2;
		System.out.println("Rows " + rows + "\nColumns " + cols);
		int max = -63;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
				int mid = arr[i + 1][j + 1];
				int last = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

				max = Math.max(max, top + mid + last);
			}
		}
		return max;

	}

}
