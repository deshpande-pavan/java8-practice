package com.javapractice.threads;

/*class MyTask extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread " + i);
		}
	}

}*/

class Mytask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread " + i);
		}
	}

}

public class TestingThreads {

	public static void main(String[] args) {
//		MyTask task = new MyTask();
//		task.start();
		Runnable r = new Mytask();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread " + i);
		}
	}

}
