package com.javapractice.interviewprograms;

public class SingletonClassDemo {

	private static SingletonClassDemo singleInstance = null;
	public String s;

	private SingletonClassDemo() {
		s = "Hello I am a part of Singleton class";
	}

	public static SingletonClassDemo getInstance() {
		if (singleInstance == null) {
			return new SingletonClassDemo();
		} else {
			return singleInstance;
		}
	}

	public static void main(String[] args) {
		SingletonClassDemo x = SingletonClassDemo.getInstance();
		SingletonClassDemo y = SingletonClassDemo.getInstance();
		SingletonClassDemo z = SingletonClassDemo.getInstance();
		x.s = (x.s).toUpperCase();
		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
	}

}
