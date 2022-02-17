package com.practice7feb2022;

public class CountWords2 {
	public static int words(String str) {

		int count = 0;

		if (str.isEmpty() || str == null)
			return 0;

		String words[] = str.split("\\s+");
		int x = words.length;

		return x;
	}

	public static void main(String[] args) {

		String str = "sunil Kumar More a a   a   aaaaaa";

		System.out.println("Number of Words " + words(str));

	}

}
