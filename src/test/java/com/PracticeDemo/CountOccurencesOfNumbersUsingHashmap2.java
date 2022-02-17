package com.PracticeDemo;

public class CountOccurencesOfNumbersUsingHashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "1232323232132323213";

		char search = '2';

		int count = 0;
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == search)

				count++;

		}

		System.out.println("the character_" + search + "_Occores " + count + " times");
	}

}
