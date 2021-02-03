package Q13;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Matrix m = new Matrix();
		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of rows in first Matrix");
		int r1 = validate(sc);
		System.out.println("Enter No of cols in first Matrix");
		int c1 = validate(sc);
		System.out.println("Enter No of rows in second Matrix");
		int r2 = validate(sc);
		System.out.println("Enter No of cols in second Matrix");
		int c2 = validate(sc);

		// Condition Check
		if (c1 != r2) {
			System.out.println("Cant be Multiplied");
		} else {

			// Matrix Input
			int a[][] = new int[r1][c1];
			int b[][] = new int[r2][c2];

			// Elements Input
			System.out.println("Enter Elements of first Matrix");
			inputMatrix(sc, r1, c1, a);
			System.out.println("Enter Elements of Second Matrix");
			inputMatrix(sc, r2, c2, b);

			// Display

			System.out.println("\n Elements of first Matrix \n");
			m.display(a, r1, c1);

			System.out.println("\n Elements of second Matrix \n");
			m.display(b, r2, c2);

			// Multiplication
			int arr[][] = multiplicationMatrix(r1, c1, c2, a, b);
			m.display(arr, r2, c2);
		}

	}

	private static int[][] multiplicationMatrix(int r1, int c1, int c2, int[][] a, int[][] b) {
		int c[][] = new int[r1][c2];

		System.out.println("\n After Multiplication : \n");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				c[i][j] = 0;
				for (int k = 0; k < c1; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}

		return c;
	}

	private static void inputMatrix(Scanner sc, int r1, int c1, int[][] a) {
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				// Validation1
				a[i][j] = validate(sc);
			}
		}
	}

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

	// Display
	public void display(int arr[][], int r, int c) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
