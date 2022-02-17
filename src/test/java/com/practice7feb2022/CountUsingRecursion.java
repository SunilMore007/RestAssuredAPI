package com.practice7feb2022;

public class CountUsingRecursion {

	public static int Countcharacters(String str, char search1, int index) {

		if (index >= str.length())
			return 0;
		int count = 0;
		if (str.charAt(index) == search1)

			count++;
		return count + Countcharacters(str, search1, index + 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Saaunil More";

		char search = 'a';

		int result = Countcharacters(input, search, 0);

		System.out.println("The Character '"+search+"' appears "+result+" times.");

	}

}
