package com.practice7feb2022;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// aaaaabcd
		String str = "aaabbc";

		// int count = 0;

		int length = str.length();
		System.out.println("length of the given string " + length);

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < length; i++) {
			if (map.containsKey(str.charAt(i))) {

				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);

			} else {

				map.put(str.charAt(i), 1);
			}

		}

		System.out.println(map);

	}

}
