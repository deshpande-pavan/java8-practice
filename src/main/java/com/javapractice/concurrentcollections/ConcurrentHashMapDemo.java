package com.javapractice.concurrentcollections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
		chm.put(101, "A");
		chm.put(102, "B");
		chm.putIfAbsent(103, "D");
		chm.putIfAbsent(101, "C");
		chm.remove(101, "D");
		chm.remove(102, "B");
		chm.replace(101, "A", "Z");
		System.out.println(chm);
	}

}
