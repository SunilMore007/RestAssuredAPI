package test;

import java.util.Scanner;

public class ArmstsrongNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to be checked "); // 153
		int rem, sum = 0;
		int num = sc.nextInt();
		int temp = num;

		while (temp > 0) {
			rem = temp % 10;
			// temp=temp/10;

			sum = sum + (rem * rem * rem);

			temp = temp / 10;
		}

		if (num == sum) {

			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number is not armstrong");
		}
	}
}
