package com.javapractice.interviewprograms;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxProb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		
		sc.close();
	}

}
