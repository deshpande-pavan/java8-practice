package com.javapractice.interviewprograms;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(timeConversion(sc.nextLine()));
		sc.close();
	}

	private static String timeConversion(String s) {
		String[] str = s.split(":");
		int hour = Integer.parseInt(str[0]);

		String min = str[1];
		String secPeriod = str[2];
		String sec = secPeriod.substring(0, secPeriod.length() - 2);
		String period = secPeriod.substring(secPeriod.length() - 2, secPeriod.length());

		StringBuilder newTime = new StringBuilder("");
		if (period.equalsIgnoreCase("AM") && (hour >= 0 && hour < 12)) {
			newTime.append(String.format("%02d", hour)).append(":").append(min).append(":").append(sec);
		} else if (period.equalsIgnoreCase("PM") && (hour >= 0 && hour < 12)) {
			newTime.append(String.format("%02d", hour + 12)).append(":").append(min).append(":").append(sec);
		} else if (hour == 12 && period.equalsIgnoreCase("AM")) {
			newTime.append("00").append(":").append(min).append(":").append(sec);
		} else if (hour == 12 && period.equalsIgnoreCase("PM")) {
			newTime.append(hour).append(":").append(min).append(":").append(sec);
		}
		return newTime.toString();
	}
}
