package com.practice7feb2022;

public class CountUsingCharaAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Sunil maaore";

		int length = input.length();
		int count = 0;

		for (int i = 0; i < length; i++)

		{

			if (input.charAt(i) == 'a')
				count++;
		}

		System.out.println("The Character '" + "a" + "' appears " + count + " times.");
	}

}
