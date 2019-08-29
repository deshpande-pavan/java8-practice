package com.javapractice.interviewprograms;

public class StringBufferString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		String s1="abc";
		
		String s = new String("abc");
		boolean test= sb.equals(s);
		boolean test1= sb.equals(s1);

		System.out.println(test);
		System.out.println(test1);
	}
}
