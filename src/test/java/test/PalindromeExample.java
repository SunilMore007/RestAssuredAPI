package test;

public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 454;
		int r;
		int sum = 0;
		int temp = n;

		while (n > 0) {
			r = n % 10;  //4  //4   5
			sum = (sum * 10) + r;  //45
			n = n / 10;  //5	

		}

		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

	}

}
