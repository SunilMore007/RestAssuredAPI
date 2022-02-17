package com.PracticeDemo;

public class CountOccurencesUsingRecurrance {

	static int findOccurrences(String input, char search) {
		int count = 0;

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == search)

				count++;

		}

		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		CountOccurencesUsingRecurrance c = new CountOccurencesUsingRecurrance();
		// c.findOccurrences("aaaaaabcd", 'a');

		char searchChar = 's';

		int result = findOccurrences("sunilmoresayali", searchChar);

		System.out.println("the character__" + searchChar + "__Occores_" + result + "_times");
	}

}
