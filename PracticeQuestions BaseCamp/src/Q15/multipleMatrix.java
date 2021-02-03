package Q15;

import java.util.Scanner;

public class multipleMatrix {
	public static void main(String[] args) {
		int row = 0, col = 0;
		// Row and Column Input and Validation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix Row");
		row = validate(sc);
		System.out.println("Enter Matrix Column");
		col = validate(sc);

		// Initialization & Validation
		int[][] A = matrixInitialization(row, col, sc);

		// Calculation
		matrixCalculation(row, col, A);

		// Display
		System.out.println("Output :  \n");
		matrixDisplay(row, col, A);
	}

	// Display Method
	private static void matrixDisplay(int row, int col, int[][] A) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Calculation Method
	private static void matrixCalculation(int row, int col, int[][] A) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				A[i][j] = (i + 1) * (A[i][j]);
			}
		}
	}

	// Initialization Method
	private static int[][] matrixInitialization(int row, int col, Scanner sc) {
		int A[][] = new int[row][col];
		System.out.println("Enter the Elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				A[i][j] = validate(sc);
			}
		}
		return A;
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
