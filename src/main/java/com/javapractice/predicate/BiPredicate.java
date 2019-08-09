package com.javapractice.predicate;

public class BiPredicate {

	public static void main(String[] args) {

		java.util.function.BiPredicate<String, String> predicate = (s1, s2) -> (s1.equals(s2));
		System.out.println(predicate.test("pavan", "pavan"));
		java.util.function.BiPredicate<Integer, Integer> p=(a,b)->(a+b)%2==0;
		System.out.println(p.test(2, 9));
	}

}
