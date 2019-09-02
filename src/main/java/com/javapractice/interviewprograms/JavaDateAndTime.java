package com.javapractice.interviewprograms;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		LocalDate newdate = LocalDate.of(year, month, date);
		System.out.println(newdate.getDayOfWeek().toString());
		sc.close();
	}
}
