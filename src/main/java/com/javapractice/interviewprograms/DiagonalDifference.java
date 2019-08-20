package com.javapractice.interviewprograms;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Row " + row);
		System.out.println("Col " + col);
		int[][] matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		sc.nextLine();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
		}
		System.out.println(printDiagonalDifference(matrix, row, col));
		sc.close();
	}

	private static int printDiagonalDifference(int[][] matrix, int row, int col) {
		int d1 = 0;
		int d2 = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j) {
					d1 += matrix[i][j];
				}
				if (i == row - j - 1) {
					d2 += matrix[i][j];
				}
			}

		}

		return Math.abs(d1 - d2);
	}

}
