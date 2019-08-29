package com.javapractice.threads;

public class AddThreadToThreadGroup implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("My name is " + t.getName() + " and I am in group " + t.getThreadGroup());
	}

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Group1");
		ThreadGroup tg1 = new ThreadGroup("Group2");
		AddThreadToThreadGroup task1 = new AddThreadToThreadGroup();
		AddThreadToThreadGroup task2 = new AddThreadToThreadGroup();
		Thread t1 = new Thread(tg, task1);
		Thread t2 = new Thread(tg1, task2);
		t1.start();
		t2.start();
	}

}
