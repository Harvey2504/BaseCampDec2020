package Q04;
import java.util.Scanner;
public class FormCircularStrings {
	// forming Circular Strings
	void formCircular(String s, int size) {
		String s1 = s + s;
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < size + i; j++) {
				temp = temp + s1.charAt(j);
			}
			System.out.println(temp);
			temp = "";
		}
	}

	// Validation Method
	int validate(Scanner sc) {
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
