package test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int n = sc.nextInt();
		int flag = 0;
		
		if (n == 0 || n == 1) {
			System.out.println(n + "_is not prime number ");
		} else {
			for (int i = 2; i <= n / 2; i++) {

				if (n % i == 0)

				{
					System.out.println(n + "_is not prime number ");
					flag = 1;
					break;
				}

			}
		}
 if (flag==0)
 {
	 
	 System.out.println(n+ "_ is prime number ");
 }
	}

}
