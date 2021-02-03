package Q14;

import java.util.Scanner;

public class Vowels {

	static boolean isVowel(char c) {

		// Vowel Array
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		// Vowel Check
		for (int i = 0; i < vowels.length; i++) {
			if (c == vowels[i])
				return true;
		}

		return false;
	}

	static int vowelCount(String sentence) {

		// Vowel Count
		int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (isVowel(sentence.charAt(i)))
				count++;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence = sc.nextLine();
		// String sentence = "Actions speak louder than words.";

		// Display
		System.out.println(vowelCount(sentence));
	}
}