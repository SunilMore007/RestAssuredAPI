package com.practice7feb2022;

public class ExtractintegersfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="5676790h54545454djsahjkdsdsada76878687";
		
		String str1=str.replaceAll("[^\\d]", " ");
		
	//	str1=str1.trim();
		
		System.out.println(str1);
		/*
		 * if (str1.equals(""))
		 * 
		 * return
		 */	}

}
