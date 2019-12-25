package com.javapractice.threads;

import java.util.stream.Stream;

public class AddThreadToThreadGroup extends Thread{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("My name is " + t.getName() + " and I am in group " + t.getThreadGroup());
	}

	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("Group1");
		ThreadGroup tg1 = new ThreadGroup(tg, "Group2");
		AddThreadToThreadGroup task1 = new AddThreadToThreadGroup();
		AddThreadToThreadGroup task2 = new AddThreadToThreadGroup();
		Thread t1 = new Thread(tg, task1);
		Thread t2 = new Thread(tg1, task2);
		System.out.println("t1 priority " + t1.getPriority());
		System.out.println("t2 prioroty " + t2.getPriority());
		tg.setMaxPriority(3);
		Thread t3 = new Thread(tg, task2);
		System.out.println("t3 priority " + t3.getPriority());
		t1.start();
		t2.start();
		t3.start();
		System.out.println(tg.activeGroupCount());

		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] tarray = new Thread[system.activeCount()];
		system.enumerate(tarray);
		Stream.of(tarray).forEach(thread -> System.out.println(thread.getName()));
	}

}
