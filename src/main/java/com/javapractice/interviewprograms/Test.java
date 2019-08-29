package com.javapractice.interviewprograms;

public class Test {

	public static void main(String[] args) {
		String s1 = new String("pavan");
		String s2 = new String("pavan");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		String s3 = "pavan";
		String s4 = "pavan";
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s3.equals(s4));
	}
}
