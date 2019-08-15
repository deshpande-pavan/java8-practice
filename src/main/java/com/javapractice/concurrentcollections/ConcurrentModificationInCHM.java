package com.javapractice.concurrentcollections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationInCHM extends Thread {
	static ConcurrentHashMap<Integer, String> hm = new ConcurrentHashMap<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Child thread updating list");
		hm.put(103, "C");
	}

	public static void main(String[] args) throws InterruptedException {
		hm.put(101, "P");
		hm.put(102, "B");
		ConcurrentModificationInCHM t = new ConcurrentModificationInCHM();
		t.start();
		Set<Integer> set = hm.keySet();
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println("main thread iteratingmap and current entry is " + i + " and value is " + hm.get(i));
			Thread.sleep(3000);
		}
		System.out.println(hm);
	}

}
