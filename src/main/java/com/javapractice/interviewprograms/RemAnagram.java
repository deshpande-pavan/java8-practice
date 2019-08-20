package com.javapractice.interviewprograms;

import java.util.Scanner;

public class RemAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(remAnagram(str1, str2));
		sc.close();
	}

	private static int remAnagram(String str1, String str2) {
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			count1[str1.charAt(i) - 'a']++;
		}
		for (int i = 0; i < str2.length(); i++) {
			count2[str2.charAt(i) - 'a']++;
		}
		int result = 0;
		int x = 0;
		for (int i = 0; i < 26; i++) {
			if (count1[i] != count2[i]) {
				if (count1[i] < count2[i]) {
					x = count1[i] - count2[i];
				} else {
					x = count2[i] - count1[i];
				}
				result += x;
			}
		}
		return Math.abs(result);
	}

}
