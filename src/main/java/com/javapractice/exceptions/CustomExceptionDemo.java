package com.javapractice.exceptions;

public class CustomExceptionDemo {

	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("Voting age should be 18 atleast");
		else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {

		try {
			validate(17);
		} catch (InvalidAgeException e) {
			System.out.println("Exception occurred:" + e);
		}
		System.out.println("rest of the code");
	}

}
