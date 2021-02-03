package Q21;

import java.util.Scanner;

public class SplitSum {

	// Split Check Logic
	public boolean splitCheck(int arr[]) {
		boolean flag = false;
		int leftSum = 0;
		int rightSum = 0;

		for (int i = 0; i < arr.length; i++) {
			leftSum += arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				rightSum += arr[j];
			}
			if (leftSum == rightSum) {
				flag = true;
			}
			rightSum = 0;
		}
		return flag;
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SplitSum ss = new SplitSum();
		// Input
		System.out.println("Enter Number of Elements");
		int nos = validate(sc);
		int arr[] = new int[nos];

		// Input Elements
		System.out.println("Enter Elements");
		for (int i = 0; i < nos; i++) {
			arr[i] = validate(sc);
		}
		// Print
		System.out.println(ss.splitCheck(arr));
	}
}
