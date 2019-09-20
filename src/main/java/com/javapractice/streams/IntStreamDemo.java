package com.javapractice.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {

	public static void main(String[] args) {
		IntStream.range(1, 10).skip(5).forEach(System.out::println);
		System.out.println(IntStream.range(1, 5).sum());
		String[] arr = { "Pavan", "Prashant", "Pradeep", "Sandeep" };
		Stream.of(arr).sorted().findFirst().ifPresent(x -> System.out.println(x));
		Arrays.stream(arr).filter(x -> x.startsWith("P")).sorted().forEach(System.out::print);
	}
}
