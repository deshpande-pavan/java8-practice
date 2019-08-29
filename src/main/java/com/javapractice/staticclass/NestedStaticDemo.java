package com.javapractice.staticclass;

public class NestedStaticDemo {

	private static String msg = "Pavan";

	public static class NestedStaticClass {
		public void pringMessage() {
			System.out.println("Inside NestedStaticClass " + msg);
		}
	}

	public class InnerClass {
		public void display() {
			System.out.println("In side non static class..InnerClass " + msg);
		}
	}

	public static void main(String[] args) {
		NestedStaticDemo.NestedStaticClass nested = new NestedStaticDemo.NestedStaticClass();
		nested.pringMessage();

		NestedStaticDemo outer = new NestedStaticDemo();
		NestedStaticDemo.InnerClass inner = outer.new InnerClass();
		inner.display();

		NestedStaticDemo.InnerClass innerObj = new NestedStaticDemo().new InnerClass();
		innerObj.display();

	}

}
