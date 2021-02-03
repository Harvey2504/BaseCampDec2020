package Q01;

import java.util.Scanner;

public class Shuffle {

	public static void main(String[] args) {
		ToLowerCase tlc = new ToLowerCase();
		ToAlternateUpperCase tauc = new ToAlternateUpperCase();

		System.out.println("Enter a Word");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String newword = "";
		int length = word.length() - 1;
		int i = 0;

		// Shuffling Logic

		while (length > i) {
			newword = newword + word.charAt(i) + word.charAt(length);
			i++;
			length--;
		}
		if (length == i) {
			newword = newword + word.charAt(i);
		}

		// To LowerCase
		String s = tlc.lowerCase(newword);
		// To AlternateUpperCase
		String finalword = tauc.upperCase(s);
		// Printing final output
		System.out.println(finalword);
	}
}
