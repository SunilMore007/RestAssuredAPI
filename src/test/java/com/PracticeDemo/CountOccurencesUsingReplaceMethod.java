package com.PracticeDemo;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesUsingReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "AaaaAaabbcccc";

		System.out.println(input);

		// count occurrence

		int count = input.length();

		String countOcc = input.replace("A", "");

		int count1 = countOcc.length();

		int res = count - count1;
		System.out.println(res);
	}

}
