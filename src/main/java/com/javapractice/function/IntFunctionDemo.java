package com.javapractice.function;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntFunctionDemo {

	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(4));

		ToDoubleFunction<Integer> f1 = i -> i * i;
		IntFunction<Integer> f2 = i -> i * i;
		System.out.println(f2.apply(3));
		ToIntFunction<String> f3 = s -> s.length();
		System.out.println(f3.applyAsInt("pavan"));
		System.out.println(f1.applyAsDouble(2));
		IntToDoubleFunction f4 = i -> Math.sqrt(i);
		System.out.println(f4.applyAsDouble(4));
	}
}