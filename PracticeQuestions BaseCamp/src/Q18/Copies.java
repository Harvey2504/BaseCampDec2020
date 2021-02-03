package Q18;

import java.util.Scanner;

public class Copies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input String
		System.out.println("Input a String");
		String word = sc.nextLine();

		// Input Repeatation Numbers
		System.out.println("Input the Number");
		int nos = validate(sc);

		// Object Creation
		Copies cs = new Copies();

		// Method Call
		cs.split(word, nos);

	}

	// Split Method
	void split(String word, int nos) {
		String temp = "";
		for (int i = 0; i < 3; i++) {
			temp = temp + word.charAt(i);
		}
		print(temp, nos);
	}

	// Print Method
	void print(String temp, int nos) {
		String s = "";
		for (int i = 0; i < nos; i++) {
			s = s + temp;
		}
		System.out.println(s);
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
