package com.javapractice.executorframework;

public class ThreadLocalDemo {

	public static void main(String[] args) {

		ThreadLocal<Object> tl = new ThreadLocal<Object>() {
			@Override
			public Object initialValue() {
				return "abc";
			}
		};
		System.out.println(tl.get());
		tl.set("durga");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}

}
