public class MatrixMultiplication {
	public static void main(String[] args) {
		int A[][] = { { 4, 8, 9 }, { 0, 2, 7 }, { 1, 6, 5 } };
		int B[][] = { { 5, 2 }, { 9, 4 } };

		int L[][] = multiplyMatrix(A, B);
		for (int i = 0; i < L.length; i++) {
			for (int j = 0; j < L[i].length; j++) {
				System.out.print(L[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] multiplyMatrix(int A[][], int B[][]) {
		int[][] l = new int[0][0];

		if (A[0].length != B.length)
			return l;

		l = new int[A.length][B[0].length];

		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < l[i].length; j++) {
				for (int k = 0; k < A[0].length; k++) {
					l[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return l;
	}

}
