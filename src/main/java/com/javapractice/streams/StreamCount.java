package com.javapractice.streams;

import java.util.ArrayList;

public class StreamCount {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			marks.add(i * 25);
		}
		System.out.println(marks);
		System.out.println(marks.stream().filter(i -> i <= 35).count());
	}

}
