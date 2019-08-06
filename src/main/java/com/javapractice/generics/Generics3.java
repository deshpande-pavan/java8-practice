package com.javapractice.generics;

import java.util.ArrayList;

public class Generics3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sachin");
		al.add("pavan");

		System.out.println(al.get(0) + al.get(1));
	}
}
