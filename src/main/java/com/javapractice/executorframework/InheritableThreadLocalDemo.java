package com.javapractice.executorframework;

class ParentThread extends Thread {

	static ThreadLocal<Object> tl = new ThreadLocal<Object>() {
		@Override
		protected Object initialValue() {
			return "pp";
		};
	};

	@Override
	public void run() {
		tl.set("pp");
		System.out.println("Parent thread value---" + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

public class InheritableThreadLocalDemo {

	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}

}
