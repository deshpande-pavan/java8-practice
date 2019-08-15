package com.javapractice.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationDemo extends Thread {

	static ArrayList<String> stringArray = new ArrayList<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Child thread updating list");
		stringArray.add("E");
	}

	public static void main(String[] args) throws InterruptedException {
		stringArray.add("A");
		stringArray.add("B");
		stringArray.add("C");
		stringArray.add("D");

		ConcurrentModificationDemo t= new ConcurrentModificationDemo();
		t.start();
		Iterator<String> itr = stringArray.iterator();
		while (itr.hasNext()) {
			System.out.println("main thread iterating list and current list item is " + itr.next());
			Thread.sleep(3000);
		}
		System.out.println(stringArray);
	}

}
