package com.javapractice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			marks.add(i * 25);
		}
		marks.add(342);
		marks.add(24);
		System.out.println(marks);
		System.out.println(
				marks.stream().sorted((i1, i2) -> i1 > i2 ? -1 : i1 < i2 ? 1 : 0).collect(Collectors.toList()));
		System.out.println(marks.stream().sorted().collect(Collectors.toList()));
		System.out.println("To reverse, just replace j with i and i with j"
				+ marks.stream().sorted((i, j) -> j.compareTo(i)).collect(Collectors.toList()));
		System.out.println(marks.stream().sorted((i, j) -> -i.compareTo(j)).collect(Collectors.toList()));

		ArrayList<String> l = new ArrayList<>();
		l.add("a");
		l.add("aaaa");
		l.add("xaa");
		l.add("xaaa");
		l.add("xxx");

		List<String> l2 = l.stream().sorted((i, j) -> i.length() > j.length() ? 1 : i.length() < j.length() ? -1 : i.compareTo(j))
				.collect(Collectors.toList());

		System.out.println(l2);
	}

}
