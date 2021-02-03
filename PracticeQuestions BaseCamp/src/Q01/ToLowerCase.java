package Q01;

public class ToLowerCase {
	// Converting Input String to Lowercase
	public String lowerCase(String input) {

		String finalword = "";
		for (int j = 0; j < input.length(); j++) {
			if (input.charAt(j) >= 65 && input.charAt(j) <= 90) {
				int c = (int) input.charAt(j) + 32;
				finalword = finalword + (char) c;
			} else {
				finalword = finalword + input.charAt(j);
			}
		}

		return finalword;
	}

}
