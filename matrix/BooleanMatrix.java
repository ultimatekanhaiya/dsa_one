package dsa;

public class BooleanMatrix {
	public static void main(String[] args) {

		int[][] arr = { { 1, 0, 0, 1 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 } };
		int r = 3;
		int c = 4;
		arr = booleanMatrix(arr, r, c);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] booleanMatrix(int[][] arr, int r, int c) {
		// creating new array for storing row values
		int[] row = new int[r];
		for (int i = 0; i < r; i++) {
			row[i] = 0;
		}

		// creating new array for storing column values
		int[] col = new int[c];
		for (int i = 0; i < c; i++) {
			col[i] = 0;
		}

		// for every 1 in arr store 1 in row[i] and col[j]
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (arr[i][j] == 1) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		// changing original arr using row and col
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (row[i] == 1 || col[j] == 1) {
					arr[i][j] = 1;
				}
			}
		}

		return arr;
	}

}
