public class Test27 {
    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] firstMatrix = { { 2, 1, 6 }, { 5, 2, 3 } };

        System.out.println("is given matrix is row-magic" + isRowMagic(firstMatrix, rows, columns));
    }

    static boolean isRowMagic(int[][] a, int rows, int columns) {

        int sum = 0;

        for (int i = 0; i < columns; i++) {
            sum += a[0][i];
        }
        for (int i = 1; i < rows; i++) {
            int sum2 = 0;
            for (int j = 0; j < columns; j++) {
                sum2 += a[i][j];
            }
            if (sum != sum2)
                return false;
        }
        return true;
    }
}
