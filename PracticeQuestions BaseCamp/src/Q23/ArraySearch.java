package Q23;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String args[]) {
		/*
		 * int arr1[] = {1,2,4,6}; int arr2[] = {2,4};
		 * 
		 * int arr1[] = {1,2,4,6}; int arr2[] = {2,3,4};
		 * 
		 * int arr1[] = {1,2,4,4,6}; int arr2[] = {2,4};
		 */

		Scanner sc = new Scanner(System.in);
		// Input Arrays
		System.out.println("Enter Number of Elements in First Array");
		int[] arr1 = inputArray(sc);
		System.out.println("Enter Number of Elements in Second Array");
		int[] arr2 = inputArray(sc);

		// Display
		boolean flag = isPresent(arr1, arr2);
		System.out.println(flag);
	}

	// Method to check presence
	private static boolean isPresent(int[] arr1, int[] arr2) {
		int k = 0;
		boolean flag = true;

		for (int i = 0; i < arr1.length; i++) {
			if (arr2[0] == arr1[i]) {
				k = i;
			}
		}
		for (int j = 0; j < arr2.length; j++) {
			if (arr2[j] != arr1[k++]) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	// Input to Array
	private static int[] inputArray(Scanner sc) {
		int nos = validate(sc);
		int arr[] = new int[nos];

		// Input Elements
		System.out.println("Enter Elements");
		for (int i = 0; i < nos; i++) {
			arr[i] = validate(sc);
		}
		return arr;
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
