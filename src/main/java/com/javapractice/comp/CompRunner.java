package com.javapractice.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompRunner {

	public static void main(String[] args) {
		List<Laptop> list = new ArrayList<>();
		list.add(new Laptop("dell", 4, 1200));
		list.add(new Laptop("alenovo", 6, 9600));
		list.add(new Laptop("macbook", 8, 1500));

		Collections.sort(list);

		for (Laptop l : list) {
			System.out.println(l.toString());
		}

		Collections.sort(list, (l1, l2) -> l1.getRam() > l2.getRam() ? -1 : l1.getRam() < l2.getRam() ? 1 : 0);
		for (Laptop l : list) {
			System.out.println(l.toString());
		}
	}
}