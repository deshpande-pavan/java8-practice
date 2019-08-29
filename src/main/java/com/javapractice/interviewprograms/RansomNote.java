package com.javapractice.interviewprograms;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String s : magazine) {
			if (hashMap.containsKey(s)) {
				hashMap.put(s, hashMap.get(s) + 1);
			} else {
				hashMap.put(s, 1);
			}
		}
		HashMap<String, Integer> hashMapNote = new HashMap<>();
		for (String s : note) {
			if (hashMapNote.containsKey(s)) {
				hashMapNote.put(s, hashMapNote.get(s) + 1);
			} else {
				hashMapNote.put(s, 1);
			}
		}
		boolean canReplicate = true;
		for (String s : hashMapNote.keySet()) {
			if (!hashMap.containsKey(s) || hashMap.get(s) < hashMapNote.get(s)) {
				canReplicate = false;
				break;
			}
		}
		System.out.println(canReplicate ? "Yes" : "No");
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
