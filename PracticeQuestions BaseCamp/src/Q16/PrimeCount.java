package Q16;

import java.util.Scanner;

public class PrimeCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IsPrime pc = new IsPrime();

		// Input
		System.out.println("Enter Number of Inputs");
		int inputNos = validate(sc);
		int arr[] = new int[inputNos];

		// Input
		System.out.println("Enter the Numbers");
		for (int i = 0; i < inputNos; i++) {
			arr[i] = validate(sc);
		}

		count(pc, inputNos, arr);

	}

	// Count
	private static void count(IsPrime pc, int inputNos, int[] arr) {
		int arr_prime[] = new int[inputNos];
		int j = 0;
		int count = 0;
		for (int i = 0; i < inputNos; i++) {
			if (pc.primeCheck(arr[i])) {
				count++;
				arr_prime[j++] = arr[i];
			}
		}
		display(arr_prime, count);
	}

	// Print
	private static void display(int[] arr_prime, int count) {
		System.out.println("Number of Primes Present are : " + count);
		if (count > 0) {
			System.out.println("The Primes are : ");
			for (int k = 0; k < count; k++) {
				System.out.print(arr_prime[k] + " ");
			}
		} else {
			System.out.println("No Primes found");
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

}
