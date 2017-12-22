package com.nv.fileop;

import java.util.HashMap;
import java.util.Map;

public class MyTestJava {
	public static void main(String[] args) {
		String[] arr = { "apple", "car", "door" };
		getUniqueElements(arr);
		System.out.println("Welcome to the test file");

	}

	static void getUniqueElements(String[] arr) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : arr) {
			char[] ch = s.toCharArray();
			for (char c : ch) {
				if (!map.containsKey(c + "")) {
					map.put(c + "", 1);
				} else {
					map.put(c + "", map.get(c + "") + 1);
				}
			}
		}
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				System.out.print(m.getKey());
			}
		}
	}
}
