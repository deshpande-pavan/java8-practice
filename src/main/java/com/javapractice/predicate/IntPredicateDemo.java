package com.javapractice.predicate;

import java.util.function.IntPredicate;

public class IntPredicateDemo {

	public static void main(String[] args) {
		IntPredicate p = i -> i % 2 == 0;
		System.out.println(p.test(10));

		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int x1 : x) {
			if (p.test(x1))
				System.out.println(x1);
		}
	}
}
