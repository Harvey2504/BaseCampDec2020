package Q25;

import java.util.Scanner;

public class Percentage {

	// Driver code

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the EmailId");
		String email = emailValidate(sc);
		Percentage p = new Percentage();
		p.wordCheck(email);

	}

	// Identifying upperCase , lowerCase , digits.

	void wordCheck(String demoInput) {
		int length = demoInput.length();
		double upperCase = 0;
		double lowerCase = 0;
		double digits = 0;

		for (int i = 0; i < length; i++) {
			if (demoInput.charAt(i) >= 65 && demoInput.charAt(i) <= 90) {
				upperCase++;
			} else if (demoInput.charAt(i) >= 97 && demoInput.charAt(i) <= 122) {
				lowerCase++;
			} else if (demoInput.charAt(i) >= 48 && demoInput.charAt(i) <= 57) {
				digits++;
			}
		}

		calculate(upperCase, lowerCase, digits, length - 1);
	}

	// Percentage Calculations

	void calculate(double uCase, double lCase, double d, int length) {
		double puCase = 0, plCase = 0, pd = 0;
		puCase = (uCase * 100) / length;
		plCase = (lCase * 100) / length;
		pd = (d * 100) / length;

		// Printing.

		System.out.println("Percentage of Uppercase Letters : " + puCase);
		System.out.println("Percentage of Lowercase Letters : " + plCase);
		System.out.println("Percentage of Digits : " + pd);
	}

	// Email Validation
	static String emailValidate(Scanner sc) {
		String val = sc.nextLine();

		do {
			int count = 0;
			int len = val.length();
			if (val.charAt(len - 3) == '.' || val.charAt(len - 4) == '.') {
				if (val.indexOf('.') > val.indexOf('@')) {
					count++;
				}
				if (count == 1) {
					return val;
				} else {
					System.out.println("Enter A Valid Email");
					val = sc.nextLine();
				}

			} else {
				System.out.println("Enter A Valid Email");
				val = sc.nextLine();
			}
		} while (true);
	}
}
