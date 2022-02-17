package com.PracticeDemo;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "AaaaAaabbcccc";

		// Character to search is 'A'.
		char search = 'A';

		int count = 0;

		Map<Character, Integer> hash = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) 
		{
			if (hash.containsKey(input.charAt(i))) 
			{
				hash.put(input.charAt(i), hash.get(input.charAt(i)) + 1);
			} 
			else 
			{
				hash.put(input.charAt(i), 1);
			}

		}

		int result = hash.get(search);
		System.out.println("the character_" + search + "_Occores " + result + " times");
	}

}
