package com.practice7feb2022;

public class CountWords {

	public static void main(String[] args) {

		String str = "sunil Kumar More a a   a   aaaaaa";

		int count = 1;

		for (int i = 0; i < str.length(); i++)

		{

			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')

			{
				count++;

			}
		}
		System.out.println("count is" + count);
	}

}
