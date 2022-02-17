package com.exception;

class MultipleCatchBlock {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		}

		catch (Exception e) {
			System.out.println("catch block executed ");
		}
		
		finally {
			System.out.println("Finally block executed ");
		}

		System.out.println("rest of the code...");
	}
}
