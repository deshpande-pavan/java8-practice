package com.javapractice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddStream {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(5);
		list.add(1);
		list.add(5);
		list.add(200);
		int ans = list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
		System.out.println(ans);
		System.out.println(list.stream().filter(i -> i <= 10).count());
		Stream<Integer> stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5 });
		stream.collect(Collectors.toSet()).forEach(i -> System.out.println(i));
		IntStream is = "pavan".chars();
		is.forEach(i -> System.out.println(i));

		Stream<Integer> integer = Stream.of(1, 2, 3, 4, 5);
		Integer[] array = integer.toArray(Integer[]::new);
		System.out.println(Arrays.toString(array));
		Stream<String> names = Stream.of("aBc", "d", "ef");
		Stream<Integer> integer1 = Stream.of(1, 2, 3, 4, 5);

		System.out.println(names.map(s -> s.toUpperCase()).collect(Collectors.toList()));
		Map<Integer, Integer> map = integer1.collect(Collectors.toMap(i -> i, i -> i + 10));
		map.forEach((k, v) -> System.out.println("Key " + k + ", " + "Value " + v));
		Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
		List<String> list1 = names2.sorted().collect(Collectors.toList());
		list1.forEach(System.out::println);

		Stream<List<String>> namesOriginalList = Stream.of(Arrays.asList("Pankaj"), Arrays.asList("David", "Lisa"),
				Arrays.asList("Amit"));
		Stream<String> flat = namesOriginalList.flatMap(s -> s.stream());
		flat.forEach(System.out::println);
	}

}
