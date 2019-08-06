package com.javapractice.interviewprograms;

public class ReturnLongestWordInSentence {

	public static void main(String[] args) {
		String input = "am a Java Developer from Blr";
		String[] words = input.split(" ");
		String longest = words[0];
		String shortest = words[0];
		for (int i = 0; i < words.length; i++) {
			if (longest.length() < words[i].length()) {
				longest = words[i];
			}
			if (shortest.length() > words[i].length())
				shortest = words[i];
		}
		System.out.println("Longest : " + longest);
		System.out.println("Shortest : " + shortest);
	}
}
