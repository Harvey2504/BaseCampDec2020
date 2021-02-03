package Q05;

public class WordSearch {
	public void search(String word, String[][] mat, int dimension) {
		String temp[] = new String[100];
		boolean flag = false;
		for (int i = 0; i < 100; i++) {
			temp[i] = "";
		}
		int k = 0;
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				temp[k] = temp[k] + mat[i][j];
			}
			k++;
		}

		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				temp[k] = temp[k] + mat[j][i];
			}
			k++;
		}

		for (int i = 0; i < dimension; i++) {
			temp[k] = temp[k] + mat[i][i];
		}
		k++;

		for (int i = 0; i < dimension; i++) {
			temp[k] = temp[k] + mat[i][dimension - 1 - i];
		}
		k++;

		for (int i = 0; i < k; i++) {
			if ((temp[i]).equals(word)) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Present");
		} else
			System.out.println("Not Present");
	}

}
