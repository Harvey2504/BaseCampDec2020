package Q24;

import java.util.Scanner;

public class Superior {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = inputArray(sc);

		// Method Call for Computing
		int arr1[][] = findSuperior(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

	// Finding Superior Element
	private static int[][] findSuperior(int[][] arr) {
		int largest = 0;
		int x = 0, y = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > largest) {
					largest = arr[i][j];
					x = i;
					y = j;
				}
			}
		}
		arr[x][y] = -1;
		return arr;
	}

	// Matrix Input
	static int[][] inputArray(Scanner sc) {
		System.out.println("Enter the Number of rows");
		int row = validate(sc);
		System.out.println("Enter the Number of cols");
		int col = validate(sc);
		int arr[][] = new int[row][col];
		System.out.println("Enter the Elements in the Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = validate(sc);
			}
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
				System.out.println("Invalid Input");
				sc.nextLine();
			}
		} while (true);
	}
}
