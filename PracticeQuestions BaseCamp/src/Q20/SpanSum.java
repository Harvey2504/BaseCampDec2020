package Q20;

import java.util.Scanner;

public class SpanSum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Range Input
		System.out.println("Enter Number of Elements");
		int nos = validate(sc);
		int sum = 0;
		int arr[] = new int[nos];

		// Data Input
		System.out.println("Enter the Data");
		for (int i = 0; i < nos; i++) {
			arr[i] = validate(sc);
		}

		// Sum
		for (int i = 1; i < nos - 1; i++) {
			sum = sum + arr[i];
		}

		// Display
		System.out.println("Sum Is : " + sum);
	}

	// Validation
	static int validate(Scanner sc) {
		int val = 0;
		do {
			if (sc.hasNextInt()) {
				val = sc.nextInt();
				sc.nextLine();
				return val;
			} else {
				System.out.println("Enter a valid input");
				sc.nextLine();
			}
		} while (true);

	}

}
