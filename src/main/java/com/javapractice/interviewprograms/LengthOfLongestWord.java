package com.javapractice.interviewprograms;

public class LengthOfLongestWord {

	public static void main(String[] args) {
		String input = " I am a Java Developer ewfsdfdstwrteerfrom Blr";
		String[] strArray = input.split(" ");
		int maxLength = 0;
		for (String s : strArray) {

			maxLength = Math.max(maxLength, s.length());
		}
		System.out.println(maxLength);
	}

}
