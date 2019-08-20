package com.javapractice.interviewprograms;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidStringUsingStreams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(findValidStringStreams(s));
		sc.close();
	}

	private static String findValidStringStreams(String s) {

		Stream<String> stream = Stream.of(s.split(""));
		Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Long min = map.values().stream().min(Long::compareTo).get();
		Long max = map.values().stream().max(Long::compareTo).get();

		System.out.println("Min=" + min);
		if (min == max) {
			return "YES";
		}
		if (max - min > 1) {
			List<Long> a = map.values().stream().sorted().collect(Collectors.toList());
			long secondMax = a.get(a.size() - 2);
			System.out.println("Size of List = " + a.size());
			System.out.println("Max = " + max);
			System.out.println("Second Max= " + secondMax);
			int count = (int) a.stream().filter(a1 -> a1 == 1).count();
			System.out.println("Count of 1 = " + count);
			if (count != 1 || secondMax != max) {
				return "NO";
			} else {
				return "YES";
			}
		}
		int countBiggerThanMin = map.values().stream().mapToInt(v -> v > min ? 1 : 0).sum();
		if (countBiggerThanMin == 1 || countBiggerThanMin == map.size() - 1) {
			return "YES";
		}
		return "NO";
	}

}
