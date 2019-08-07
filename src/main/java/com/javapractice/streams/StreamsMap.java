package com.javapractice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			marks.add(i * 15);
		}
		System.out.println(marks);
		List<Integer> l2 = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(l2);
	}
}
