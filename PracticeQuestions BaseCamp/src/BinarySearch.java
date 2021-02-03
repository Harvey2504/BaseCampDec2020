import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		int size = sc.nextInt();
		String words[] = new String[size];
		for (int i = 0; i < words.length; i++) {
			words[i] = sc1.nextLine();
		}

		bubbleSort(words);
		System.out.println("Sorted Array");
		for (int j = 0; j < words.length; j++) {
			System.out.println(words[j]);
		}

		System.out.println("Enter a key word to Search");
		String key = sc1.nextLine();

		System.out.print(binarySearch(words, key));

	}

	public static String[] bubbleSort(String words[]) {

		String temp = "";
		for (int i = 0; i < words.length; i++) {
			int count = 0;
			for (int j = 0; j < words.length - 1; j++) {
				if ((words[j].compareTo(words[j + 1])) > 0) {
					temp = words[j];
					words[j] = words[j + 1];
					words[j + 1] = temp;
					count = 1;
				}

			}
			if (count == 0) {
				break;
			}
		}

		return words;
	}

	public static boolean binarySearch(String arr[], String key) {
		int low = 0;
		int high = arr.length - 1;
		int mid = (high + low) / 2;

		while (high >= low) {
			if (arr[mid].equals(key)) {
				return true;
			} else if (key.compareTo(arr[mid]) > 0) {
				low = mid + 1;
			} else if (key.compareTo(arr[mid]) < 0) {
				high = mid - 1;
			}
			mid = (high + low) / 2;
		}
		if (low > high) {
			return false;
		}

		return false;

	}

}
