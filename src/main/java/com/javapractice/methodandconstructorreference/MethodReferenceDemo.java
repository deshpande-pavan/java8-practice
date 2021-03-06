package com.javapractice.methodandconstructorreference;

public class MethodReferenceDemo {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		MethodReferenceDemo methodDemo = new MethodReferenceDemo();
		Runnable r = methodDemo::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
