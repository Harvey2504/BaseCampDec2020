package Q06;

import java.util.*;

public class IncomeTax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your salary");
		double IT = 0.0;

		double salary = validate(sc);

		// condition Check
		if (salary >= 0) {
			IT = calculate(salary);
			System.out.println("Income Tax Amount Is : " + IT);
		} else {
			System.out.print("Salary cant be negative");
		}

	}

	static double calculate(double salary) {
		double IT = 0;
		double taxable_amount;
		// Fist Tax Slab
		if (salary > 50000 && salary <= 60000) {
			taxable_amount = salary - 50000;
			IT = taxable_amount * .1;
		}
		// Second Tax Slab
		else if (salary > 60000 && salary < 150000) {
			taxable_amount = salary - 60000;
			IT = 10000 * .1 + taxable_amount * .2;
		}
		// Third tax Slab
		else if (salary > 150000) {
			taxable_amount = salary - 150000;
			IT = 10000 * .1 + 90000 * .2 + taxable_amount * .3;
		}
		return IT;
	}

	// Income Validation Method
	static double validate(Scanner sc) {
		double val = 0;
		do {
			if (sc.hasNextDouble()) {
				val = sc.nextDouble();
				sc.nextLine();
				return val;
			} else {
				System.out.println("Enter a valid input");
				sc.nextLine();
			}
		} while (true);

	}

}
