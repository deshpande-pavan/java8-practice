package com.javapractice.interviewprograms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubArraySum {

	public static void main(String[] args) {
		int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
		int sum = 7;
		subArraySum(arr, sum);
	}

	private static void subArraySum(int[] arr, int sum) {
		int arrayLength = arr.length;
		for (int i = 0; i < arrayLength; i++) {
			int curSum = 0;
			for (int j = i; j < arrayLength; j++) {
				curSum += arr[j];
				if (curSum == sum) {
					print(arr, i, j);
				}
			}
		}
	}

	private static void print(int[] arr, int i, int j) {
		System.out.println(IntStream.range(i, j + 1).mapToObj(k -> arr[k]).collect(Collectors.toList()));
	}

}
