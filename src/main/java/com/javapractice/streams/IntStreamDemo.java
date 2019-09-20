package com.javapractice.streams;

import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {
		IntStream.range(1, 10).skip(5).forEach(System.out::println);
		System.out.println(IntStream.range(1, 5).sum());
	}
}
