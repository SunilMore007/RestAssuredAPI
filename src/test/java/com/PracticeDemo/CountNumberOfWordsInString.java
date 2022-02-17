package com.PracticeDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountNumberOfWordsInString {

	  public static void main(String[] args)
	    {
		String str = "Sunil Is from Sangli";

		String Words[] = str.split(" ");

		System.out.println("Test");

		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (String word : Words)

		{
			Integer i = hm.get(word);

			if (i == null) {
				hm.put(word, 1);
			}

			else {

				hm.put(word, i + 1);
			}

		}

		System.out.println(hm);
	}
}