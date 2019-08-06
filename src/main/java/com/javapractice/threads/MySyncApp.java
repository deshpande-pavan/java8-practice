package com.javapractice.threads;

class Printer {
	void printDocs(int numOfCopies, String docName) {
		for (int i = 1; i <= numOfCopies; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("printing " + docName + " " + i);
		}
	}
}

class MyThread extends Thread {
	Printer pref;

	public MyThread(Printer p) {
		this.pref = p;
	}

	@Override
	public void run() {
		synchronized (pref) {
			pref.printDocs(10, "Your Profile");
		}
	}
}

class YourThread extends Thread {
	Printer pref;

	public YourThread(Printer p) {
		this.pref = p;
	}

	@Override
	public void run() {
		synchronized (pref) {
			pref.printDocs(10, "Your Profile");
		}

	}
}

public class MySyncApp {

//	main is representing main thread
	public static void main(String[] args) {
		System.out.println("Main Application started");
//		we have multiple threads working on same printer object
//		If multiple threads are going to work on single objects, we must synchronize them
		Printer printer = new Printer();
		MyThread mtask = new MyThread(printer);
		YourThread ytask = new YourThread(printer);
		ytask.setDaemon(true);
		mtask.start();
		System.out.println("Main Application finished");
	}

}
