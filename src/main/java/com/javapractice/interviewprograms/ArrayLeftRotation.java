package com.javapractice.interviewprograms;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 5, 6 };
		int[] arr2 = { 2, 3, 4, 5, 6 };
		int[] a = leftRotation(arr1, 2);
		int[] b = leftRotationDiffMethod(arr2, 2);

		System.out.println("Left rotation by diff array is:");
		for (int i : b) {
			System.out.print(i+" ");
		}
		System.out.println("\nLeft rotation by using same array:");
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

	private static int[] leftRotationDiffMethod(int[] arr, int times) {
		int[] rotated_arr = new int[arr.length];
		int rotatedIndex = times;
		int size = arr.length;
		int i = 0;
		while (rotatedIndex < size) {
			rotated_arr[i] = arr[rotatedIndex];
			rotatedIndex++;
			i++;
		}
		rotatedIndex = 0;
		while (rotatedIndex < times) {
			rotated_arr[i] = arr[rotatedIndex];
			rotatedIndex++;
			i++;
		}
		return rotated_arr;
	}

	private static int[] leftRotation(int[] arr, int times) {

		for (int i = 0; i < times; i++) {
			int first = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = first;
		}

		return arr;

	}

}
