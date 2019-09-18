package com.javapractice.interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrangeToFormBiggest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		getBiggest(arr);
		sc.close();
	}

	private static void getBiggest(int[] arr) {

		List<String> list = new ArrayList<>();
		for (int i : arr) {
			list.add(Integer.toString(i));
		}

//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String x, String y) {
//				String xy = x + y;
//				String yx = y + x;
//
//				return xy.compareTo(yx) > 0 ? -1 : 1;
//			}
//		});

		
		
		Collections.sort(list, (x, y) -> {
			String xy = x + y;
			String yx = y + x;
			return xy.compareTo(yx) > 0 ? -1 : 1;
		});

		Iterator<String> iterator = list.iterator();
		String ans = "";
		while (iterator.hasNext()) {
			ans = ans + iterator.next();
		}

		System.out.println(ans);
	}

}
