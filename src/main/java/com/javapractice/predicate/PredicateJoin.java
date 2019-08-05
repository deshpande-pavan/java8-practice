package com.javapractice.predicate;

import java.util.function.IntPredicate;

public class PredicateJoin {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5, 76, 87, 989, 432 };
		IntPredicate p1 = i -> i % 2 == 0;
		IntPredicate p2 = i -> i > 100;
		for (int i : x) {
			if (p1.and(p2).test(i)) {
				System.out.println(i);
			}
			if(p1.or(p2).test(i))
				System.out.println(i);
			/*
			 * if(p1.negate().test(i)) System.out.println(i);
			 */
		}
	}
}
