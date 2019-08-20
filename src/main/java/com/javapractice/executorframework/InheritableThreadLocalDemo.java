package com.javapractice.executorframework;

class ParentThread extends Thread {

	static InheritableThreadLocal<Object> tl = new InheritableThreadLocal<Object>() {
		@Override
		protected Object childValue(Object parentValue) {
			return "cc";
		}
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
