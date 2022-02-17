package test;

public class DisplayEvenNumbersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 100;
		System.out.println("Number is " + number);

		for (int i = 1; i < number; i++) {
			if (i % 2 == 0)
				System.out.println(i + " ");

		}
	}

}
