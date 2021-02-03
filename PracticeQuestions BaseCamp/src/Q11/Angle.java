package Q11;

import java.util.Scanner;

public class Angle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Angle an = new Angle();
		System.out.println("Enter The Time in 24Hr Format");
		System.out.println("For Ex : 22.30");
		String time = timeValidate(sc);
		double entryhour = ((time.charAt(0) - 48) * 10) + time.charAt(1) - 48;
		double entrymin = ((time.charAt(3) - 48) * 10) + time.charAt(4) - 48;

		an.findAngle(entryhour, entrymin);
	}

	//Finding Angle
	void findAngle(double hour, double min) {

		double angle = 0;
		if (hour >= 12) {
			hour -= 12;
		}

		// for Hour hand position
		double h = (hour * 360) / 12 + (min * 360) / (12 * 60);

		// for Minute hand position
		double m = (min * 360) / 60;

		// Angle difference
		if (h > m) {
			angle = h - m;
		} else {
			angle = m - h;
		}

		if (angle > 180) {
			angle = 360 - angle;
		}

		System.out.println("The Angle In Between Is : " + angle);

	}

	// Time Validation
	static String timeValidate(Scanner sc) {
		String val = "";
		int entryhour = 0;
		int entrymin = 0;
		val = sc.nextLine();
		do {
			if ((val.length() == 5) && (val.charAt(0) >= 48 && val.charAt(0) <= 57)
					&& (val.charAt(1) >= 48 && val.charAt(1) <= 57) && (val.charAt(2) == '.')
					&& (val.charAt(3) >= 48 && val.charAt(3) <= 57) && (val.charAt(4) >= 48 && val.charAt(4) <= 57)) {
				entryhour = ((val.charAt(0) - 48) * 10) + val.charAt(1) - 48;
				entrymin = ((val.charAt(3) - 48) * 10) + val.charAt(4) - 48;
				if ((entryhour >= 00 && entryhour <= 23) && (entrymin >= 00 && entrymin < 60)) {
					return val;
				} else {
					System.out.println("Enter a valid input");
					val = sc.nextLine();
				}

			} else {
				System.out.println("Enter a valid input");
				val = sc.nextLine();
			}
		} while (true);

	}
}
