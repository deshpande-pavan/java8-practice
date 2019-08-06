package com.javapractice.interviewprograms;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class CountSubStringInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String pattern = "p++";
		System.out.println(substringCountm1(input, pattern));
		System.out.println(substringCountm2(input, pattern));

		sc.close();
	}

	private static int substringCountm2(String input, String pattern) {
		return StringUtils.countMatches(input, pattern);
	}

	private static int substringCountm1(String input, String pattern) {
		return input.split(Pattern.quote(pattern)).length - 1;

	}

}
