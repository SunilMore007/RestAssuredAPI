package com.practice7feb2022;

public class CountOccurencesUsingReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "aaabbcddddSunil";

		System.out.println("given string " + input);

		int givenstringlength = input.length();

		String temp = input.replace("S", "");
		int newStringlength=temp.length();
		
		int result =givenstringlength-newStringlength;
		System.out.println("Occurance of s is "+result);

	}

}
