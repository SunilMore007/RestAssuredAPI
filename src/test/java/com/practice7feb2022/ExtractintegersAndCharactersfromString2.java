package com.practice7feb2022;

public class ExtractintegersAndCharactersfromString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "5676790h54545454djsahj78798798kdsdsada76878687";

		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();

	//	String str1 = str.replaceAll("[^\\d]", " ");

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if (Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			else
				special.append(str.charAt(i));

		}

		System.out.println(alpha);
		System.out.println(num);
		System.out.println(special);
	}

}
