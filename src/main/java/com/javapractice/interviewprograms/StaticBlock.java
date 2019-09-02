package com.javapractice.interviewprograms;

import java.util.Scanner;

public class StaticBlock {
	static int B = new Scanner(System.in).nextInt();
	static int H = new Scanner(System.in).nextInt();
	static boolean flag = B > 0 && H > 0;
	static {
		if (!flag)
			System.out.println("java.lang.Exception: Breadth and height must be positive");
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
	}

}
