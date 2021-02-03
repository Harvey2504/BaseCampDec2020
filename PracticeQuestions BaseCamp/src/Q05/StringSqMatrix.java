package Q05;

import java.util.*;

public class StringSqMatrix {
	static int dimension = 0;
	static String mat[][] = new String[100][100];
	static String word = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		WordSearch ws = new WordSearch();
		int choice = 0;
		int counter = 0;

		do {
			System.out.println("1.Enter the dimension of Square Matrix \n" + "2.Fill the matrix with Characters \n"
					+ "3.Enter the string \n" + "4.Exit \n");

			// Validation
			choice = validate(sc);

			// Input Check
			if (counter == 0 && (choice == 2 || choice == 3)) {
				System.out.println("Cant Find Any Data");
				break;
			}
			counter++;

			switch (choice) {
			
			// Dimensions Input
			case 1:
				System.out.println("Please enter the Dimensions");
				dimension = validate(sc);
				break;

			// Entry of Characters
			case 2:
				System.out.println("Please enter the Characters");
				for (int i = 0; i < dimension; i++) {
					for (int j = 0; j < dimension; j++) {
						mat[i][j] = sc1.nextLine();
					}
				}

				// Display
				display();

				break;
				
				//Input Word
			case 3:
				System.out.println("Enter the String");
				word = sc1.nextLine();
				ws.search(word, mat, dimension);

				break;

			case 4:
				break;

			default:
				System.out.println("Please Enter A Valid Input");
				break;

			}
		} while (choice != 4);
	}

	private static void display() {
		// Matrix Display
		System.out.println("\n The Matrix Created \n");
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
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

}
