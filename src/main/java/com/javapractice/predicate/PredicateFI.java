package com.javapractice.predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateFI {

	public static void main(String[] args) {
		IntPredicate p1 = i -> i % 2 == 0;
		Predicate<String> p2 = s -> s.length() > 4;

		System.out.println(p2.test("Pavan"));
		System.out.println(p1.test(1001));

		String[] s = { "pavan", "nags", "karannesgi", "sunsny", "katrina" };
		Predicate<String> p = s1 -> s1.length() % 2 == 0;
		for (String str : s) {
			if (p.test(str)) {
				System.out.println(str);
			}
		}
	}
}
