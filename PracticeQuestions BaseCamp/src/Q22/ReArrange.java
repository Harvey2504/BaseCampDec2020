package Q22;

import java.util.Scanner;

public class ReArrange {
	public static void main(String[] args) {
		/*
		 * Hard Coded int arr[] = {1,3,1,4}; int arr[] = {1,3,1,4,4,3,1}; int arr[] =
		 * {3,2,2,4};
		 */

		Scanner sc = new Scanner(System.in);

		// Input Number
		System.out.println("Enter Number of Elements");
		int x = validate(sc);
		int arr[] = new int[x];

		// Input Elements
		System.out.println("Enter The Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = validate(sc);
		}

		// Display Before Shuffling
		display(arr);
		// Display After Shuffling
		display(shuffle(arr));

	}

	// Logic
	private static int[] shuffle(int[] arr) {
		int j = 0;
		int rep[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 3) {
				rep[j++] = arr[i + 1];
				arr[i + 1] = 4;
			}
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == 4 && arr[i - 1] != 3) {
				arr[i] = rep[--j];
				if (j == 0) {
					break;
				}

			}
		}
		return arr;
	}

	// Display Method
	private static void display(int[] arr) {
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
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
