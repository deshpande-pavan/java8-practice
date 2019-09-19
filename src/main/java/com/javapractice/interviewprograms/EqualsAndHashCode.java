package com.javapractice.interviewprograms;

class TestEqualsHashCode {
	protected String name;
	protected int id;

	TestEqualsHashCode(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return (int) name.charAt(0);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		TestEqualsHashCode test = (TestEqualsHashCode) obj;
		return (test.name == this.name && test.id == this.id);
	}

}

public class EqualsAndHashCode {

	public static void main(String[] args) {
		TestEqualsHashCode test1 = new TestEqualsHashCode("bac", 1);
		TestEqualsHashCode test2 = new TestEqualsHashCode("bac", 1);

		if (test1.hashCode() == test2.hashCode()) {
			if (test1.equals(test2)) {
				System.out.println("Objects are equal");
			} else {
				System.out.println("Objects are not equal");
			}
		} else {
			System.out.println("Objects are not equal");
		}
	}

}
