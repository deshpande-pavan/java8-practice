package com.javapractice.interviewprograms;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

	public static void main(String[] args) {
		int[] arr = { 10, 2, -2, -20, 10 };
		int sum = -18;
		subArraySum(arr, sum);
	}

	private static void subArraySum(int[] arr, int sum) {

		int arrayLength = arr.length;
		int cursum = 0;
		int start = 0;
		int end = -1;

		Map<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < arrayLength; i++) {
			cursum += arr[i];
			if (cursum - sum == 0) {
				start = 0;
				end = i;
				break;
			}

			if (hashMap.containsKey(cursum - sum)) {
				start = hashMap.get(cursum - sum) + 1;
				end = i;
				break;
			}

			hashMap.put(cursum, i);
		}

		if (end == -1) {
			System.out.println("No subarray with sum exists");
		} else {
			System.out.println("Sum found between indexes " + start + " and " + end);
		}
	}

}
