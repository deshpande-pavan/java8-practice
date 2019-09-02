package com.javapractice.interviewprograms;

import java.util.Scanner;

public class EndOfFileJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;
		int i = 1;
		while (sc.hasNext()) {
			input = sc.nextLine();
			System.out.println(i + " " + input);
			i++;
		}
		sc.close();

	}

}
