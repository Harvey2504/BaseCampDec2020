package Q02;

import java.util.Scanner;

public class WordsCount {
	static String sentence = "";
	static int len = 0;

	public static void main(String[] args) {

		// Displaying Options

		while (true) {
			System.out.println(" \n Enter a Number From Below \n");
			System.out.println("1.Input a Sentence \n" + "2.Count Number of Words in the Sentence \n"
					+ "3.Count Number of Vowels in the Sentence \n" + "4.Print all the Words Present in Sentence");
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			int choice = 0;

			// Validation
			boolean flag = true;
			while (flag) {
				if (sc.hasNextInt()) {
					choice = sc.nextInt();
					flag = false;
				} else {
					System.out.println("Invalid Input");
					sc.next();
				}
			}
			flag = true;

			switch (choice) {

			// Sentence Input
			case 1:
				System.out.println("Enter A Sentence");
				sentence = sc1.nextLine();
				len = sentence.length();
				System.out.println("Successfully Stored \n");
				break;
				
			// Counting nos of words
			case 2:
				int count = 0;
				for (int i = 0; i < len; i++) {
					if ((i == 0) && (sentence.charAt(0) != ' ')
							|| (i > 0) && sentence.charAt(i) != ' ' && sentence.charAt(i - 1) == ' ') {
						count++;
					}
				}
				System.out.println("Number of Words : " + count);
				break;

			// Counting Vowels
			case 3:
				int count1 = 0;

				for (int i = 0; i < len; i++) {
					char c = sentence.charAt(i);
					if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o'
							|| c == 'U' || c == 'u') {
						count1++;
					}

				}
				System.out.println("Number of Vowels : " + count1);
				break;

			// Finding words
			case 4:
				FormWords fw = new FormWords();
				String arr[] = fw.words(sentence);

				// Display

				for (int k = 0; k < arr.length; k++) {
					if (arr[k] != null) {
						System.out.println(arr[k]);
					}

				}

				break;

			default:
				System.out.println("Wrong Input..! Please Enter Again \n");

			}

		}
	}

}
