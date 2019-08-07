package com.javapractice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			l.add(i * 25);
		}
		System.out.println(l);
		List<Integer> l2 = l.stream().filter(i -> i <= 35).map(i -> i + 5).filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(l2);
	}

}
