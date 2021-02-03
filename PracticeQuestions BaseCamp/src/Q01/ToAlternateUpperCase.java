package Q01;

public class ToAlternateUpperCase {
	// Alternate index converted to Uppercase
	public String upperCase(String input) {

		String finalword = "";
		for (int k = 0; k < input.length(); k++) {
			if (k % 2 != 0) {
				int d = (int) input.charAt(k) - 32;
				finalword = finalword + (char) d;
			} else
				finalword = finalword + input.charAt(k);
		}

		return finalword;
	}

}
