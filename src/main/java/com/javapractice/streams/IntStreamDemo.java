package com.javapractice.streams;

import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {
		IntStream.range(1, 10).forEach(System.out::println);
	}

}
