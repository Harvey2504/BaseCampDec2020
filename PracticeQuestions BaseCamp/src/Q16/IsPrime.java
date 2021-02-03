package Q16;

public class IsPrime {

	boolean primeCheck(int input) {
		boolean flag = true;
		if (input == 0 || input == 1) {
			flag = false;
		} else {
			for (int i = 2; i <= input / 2; i++) {
				if (input % i == 0) {
					flag = false;
					break;
				}
			}
		}

		return flag;

	}
}
