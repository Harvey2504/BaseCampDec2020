package Q10;

import java.util.Scanner;

public class Unique {
	public static void main(String[] args) {

		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String input = sc.nextLine();

		// Object Creation
		Unique obj = new Unique();

		// Display
		if (obj.isUnique(input)) {
			System.out.println("The Input Has Unique All Characters");
		} else {
			System.out.println("The Input Is Not Unique");
		}
	}

	// Unique characters Check
	boolean isUnique(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
