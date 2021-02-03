package Q03;

import java.util.Scanner;

public class CircString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first String");
		String first = sc.nextLine();

		System.out.println("Enter the second String");
		String second = sc.nextLine();

		Circular c = new Circular(first, second);

		boolean result = c.isCircular();
		if (result == true) {
			System.out.println(first + " and " + second + " are circular");
		} else {
			System.out.println(first + " and " + second + " are not circular");
		}
	}
}