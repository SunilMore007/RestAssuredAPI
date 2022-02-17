package com.PracticeDemo;

public class CountOccurencesUsingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Aaaaaabbcccc";

		char search = 'A';

		int count = 0;
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == search)

				count++;

		}

		System.out.println("the character_" + search + "_Occores " + count + " times");
	}

}
