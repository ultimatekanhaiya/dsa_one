public class RotateSquareMatrix90 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotateBy90(arr);
		/*
		 * arr = rotateBy90(arr); for(int i = 0; i < arr.length; i++) { for(int j = 0; j
		 * < arr.length; j++) { System.out.print(arr[i][j] + " "); }
		 * System.out.println(); }
		 */
	}

	static void rotateBy90(int[][] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		// return arr;
	}

}
