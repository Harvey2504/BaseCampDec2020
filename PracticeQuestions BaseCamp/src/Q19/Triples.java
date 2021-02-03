package Q19;

import java.util.Scanner;

public class Triples {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Elements Entry
		System.out.println("Enter Number of Elements");
		int nos = validate(sc);
		int arr[] = new int[nos];

		// Input Numbers
		System.out.println("Enter the Numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = validate(sc);
		}
		Triples t = new Triples();

		// Condition
		if (t.checkTriples(arr) == -1) {
			System.out.println("No Triples");
		} else {
			System.out.println("Triples Found");
			System.out.print("The Number is : ");
			System.out.println(t.checkTriples(arr));
		}

	}

	// Condition Check
	int checkTriples(int a[]) {
		int len = a.length;
		int temp = 0;
		for (int i = 0; i < len - 2; i++) {
			if (a[i] == a[i + 1] && a[i + 1] == a[i + 2]) {
				temp = a[i];
				return temp;
			}
		}
		return -1;
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
