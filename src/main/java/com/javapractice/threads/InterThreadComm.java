package com.javapractice.threads;

class A {
	int num;
	boolean valueSet = false;

	public synchronized void put(int num) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		System.out.println("Put :" + num);
		this.num = num;
		valueSet = true;
		notify();
	}

	public synchronized void get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Get :" + num);
		valueSet = false;
		notify();
	}
}

class Producer implements Runnable {

	A a;

	public Producer(A a) {
		this.a = a;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			a.put(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

}

class Consumer implements Runnable {
	A a;

	public Consumer(A a) {
		this.a = a;
		Thread t1 = new Thread(this, "Consumer");
		t1.start();
	}

	@Override
	public void run() {
		while (true) {
			a.get();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class InterThreadComm {

	public static void main(String[] args) {
		A a = new A();
		new Producer(a);
		new Consumer(a);
	}

}
