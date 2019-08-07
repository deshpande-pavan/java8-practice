package com.javapractice.streams;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StreamMinMax {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			marks.add(i * 25);
		}
		marks.add(342);
		marks.add(24);

		marks.stream().forEach(System.out::println);
		Consumer<Integer> c=i->System.out.println(i);
		marks.stream().forEach(i->System.out.println("The number is "+i));
		marks.stream().forEach(c);
//		max is last element no matter what the sorting is
//		min is first element no matter ehat the sorting is
		Integer l1 = marks.stream().min((i, j) -> i.compareTo(j)).get();
		System.out.println(l1);
		Integer l2 = marks.stream().max((i, j) -> i.compareTo(j)).get();
		System.out.println(l2);
//		max is last element no matter what the sorting is
//		min is first element no matter ehat the sorting is
		Integer l3 = marks.stream().min((i, j) -> -i.compareTo(j)).get();
		System.out.println(l3);
		Integer l4 = marks.stream().max((i, j) -> -i.compareTo(j)).get();
		System.out.println(l4);

	}

}
