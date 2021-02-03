package Q07;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		int num = 0;

		// Condition Check

		num = validate(sc);
		num = rangeValidate(num, sc);
		int arr[] = new int[num];

		System.out.println("Enter Natural Numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = validate(sc);
			arr[i] = rangeValidate(arr[i], sc);
		}

		display(arr);

	}

	static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {

			System.out.println("The Square of " + arr[i] + " : " + arr[i] * arr[i]);

		}

	}

	// Validation Method
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

	// Range Validation Method
	static int rangeValidate(int val, Scanner sc) {
		do {
			if (val <= 10) {
				return val;
			} else {
				System.out.println("Enter a valid input");
				val = sc.nextInt();
			}
		} while (true);

	}
}
