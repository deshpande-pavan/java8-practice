package com.javapractice.interviewprograms;

import java.util.HashMap;
import java.util.Scanner;

public class ValidString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(findValidString(s));
		sc.close();
	}

	private static String findValidString(String s) {
		if (s == null || s.isEmpty()) {
			return "YES";
		}
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		int min = (int) Math.pow(10, 5);
		int max = 0;
		for (int value : map.values()) {
			if (value < min) {
				min = value;
			}
			if (value > max) {
				max = value;
			}
		}
		if (min == max) {
			return "YES";
		}
		if (max - min > 1) {
			return "NO";
		}
		int contBiggerThanMin = 0;
		for (int value : map.values()) {
			if (value > min) {
				contBiggerThanMin++;
			}
		}
		if (contBiggerThanMin == 1 || contBiggerThanMin == (map.size() - 1)) {
			return "YES";
		}

		return "NO";
	}

}
