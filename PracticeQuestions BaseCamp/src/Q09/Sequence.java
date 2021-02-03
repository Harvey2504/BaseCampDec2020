package Q09;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input
		System.out.println("Enter a Number (should not be a multiple of 2 or 5): ");
		int num = validate(sc);

		// Input Check
		if (num > 0 && num <= 10000 && num % 2 != 0 && num % 5 != 0) {
			System.out.println(ones(num));
		} else {
			System.out.println("Not Possible");
		}
	}
	
	public static int ones(int input) {

		// Finding Number of 1's
		int count = 1;
		long multiple = 11;
		long rem = 10;

		while (rem != 0) {
			rem = multiple % input;
			multiple = (multiple * 10 + 1);
			count++;
		}
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
