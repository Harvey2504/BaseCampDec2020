package Q04;

import java.util.Scanner;

public class CircularString {
	// driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		FormCircularStrings fcs = new FormCircularStrings();
		System.out.println("Enter a String: ");
		String word = sc.nextLine();

		System.out.println("Enter the length of Circular Strings: ");
		size = fcs.validate(sc);

		if (size > word.length() || size <= 0) {
			System.out.println("Size Input Invalid");
		} else {
			// Display
			fcs.formCircular(word, size);
		}

		sc.close();
	}
}