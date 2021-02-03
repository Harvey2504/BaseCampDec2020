package Q03;

public class Circular {
	private String first;
	private String second;

	// Parameterized constructor
	public Circular(String first, String second) {

		// Initialization
		this.first = first;
		this.second = second;
	}

	boolean isCircular() {
		if (first.length() == second.length()) {
			String string3 = first + first;
			int result = string3.indexOf(second);
			if (result >= 0) {
				return true;
			}

		}
		return false;
	}
}
