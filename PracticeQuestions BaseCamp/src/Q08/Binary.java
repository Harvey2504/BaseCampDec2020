package Q08;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = 0;
		int c = 0;
		// Validate
		number = validate(sc);

		// Negative Number Condition Check
		if (number >= 0) {
			c = binaryZeros(number);
			System.out.println("The Binary Form Is : " + c);
		} else {
			System.out.println("Please Enter Positive Number");
		}

	}

	static int binaryZeros(int n) {

		int arr[] = new int[40];
		int index = 0;
		// long result=0;
		while (n > 0) {
			arr[index++] = n % 2;
			n = n / 2;
		}

		// Counting Zeroes
		int count = 0;
		for (int i = 0; i < index; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}

		// For Binary Number
		/*
		 * for(int i=index-1;i>=0;i--) { result=10*result+arr[i]; }
		 */
		return count;
	}

	static int validate(Scanner sc) {
		int val = 0;
		do {
			if (sc.hasNextInt()) {
				val = sc.nextInt();
				sc.nextLine();
				return val;
			} else {
				System.out.println("Invalid Input");
				sc.nextLine();
			}
		} while (true);
	}

}
