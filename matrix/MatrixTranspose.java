/*
 * source - youtube(prepcode)
 * MATRIX TRANSPOSE 
 * for matrix transpose we changes all rows to column or vice versa
 * or technically we replace arr[i][j] = arr[j][i] but we use this operation on upper
 * triangle only otherwise we will end up with same matrix without any change.
 * 
 */
package dsa;

public class MatrixTranspose {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		transpose(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] transpose(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		return arr;
	}

}