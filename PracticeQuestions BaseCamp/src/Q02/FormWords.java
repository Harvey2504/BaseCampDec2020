package Q02;

public class FormWords {
	public String[] words(String input) {
		String arr[] = new String[100];
		String word = "";
		String newsentence = input + " ";
		int c = 0;
		for (int i = 0; i < newsentence.length(); i++) {
			if (newsentence.charAt(i) != ' ') {
				word = word + newsentence.charAt(i);
			} else {
				arr[c++] = word;
				word = "";

			}
		}
		return arr;
	}

}
