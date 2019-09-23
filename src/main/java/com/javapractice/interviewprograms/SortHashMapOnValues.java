package com.javapractice.interviewprograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortHashMapOnValues {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);


		Map<String, Integer> map = sortByValues(hm);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static Map<String, Integer> sortByValues(HashMap<String, Integer> hm) {
		List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());

		Collections.sort(list, (obj1, obj2) -> obj1.getValue().compareTo(obj2.getValue()));

		Map<String, Integer> temp = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

}
