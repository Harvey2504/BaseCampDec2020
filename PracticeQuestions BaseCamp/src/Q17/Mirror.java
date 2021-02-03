package Q17;

import java.util.Scanner;

public class Mirror {
	// Method
	public static String reverse(String input) {
		String rev = "";
		int length = input.length();
		for (int i = 0; i < length; i++) {
			rev = input.charAt(i) + rev;
		}
		return rev;
	}

	public static void main(String[] args) {
		Mirror mr = new Mirror();
		Scanner sc = new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter The size");
		int size = sc.nextInt();
		String arr[] = new String[size];
		String arr1[] = new String[size];
		
		System.out.println("Enter the string");
		for (int i = 0; i <arr.length; i++) {
			arr[i] = sc1.nextLine();
		}

		for (int j = 0; j < arr.length; j++) {
			arr1[j] = arr[j] + " " + reverse(arr[j]);
			System.out.println(arr1[j]);
		}

	}
}
