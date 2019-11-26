package com.javapratice.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeAPI {
	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		System.out.println(today);
		LocalDate firstDayOfFeb= LocalDate.of(2019, Month.SEPTEMBER, 17);
		System.out.println(firstDayOfFeb);
		LocalDate todayKolkata= LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(todayKolkata);
	}
}
