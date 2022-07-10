/*
 * Reference: GFG ->  https://www.geeksforgeeks.org/check-given-matrix-is-magic-square-or-not/
 * Explanation : Magic square
 */
public class MagicSquare {
    public static void main(String[] args) {
        int n = 3;
        int mat[][] = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };

        if (isMagic(mat, 3))
            System.out.println("Magic Square");
        else
            System.out.println("Not a magic Square");
    }

    static boolean isMagic(int[][] arr, int n) {

        int sumd1 = 0;
        int sumd2 = 0;

        for (int i = 0; i < n; i++) {
            sumd1 += arr[i][i];
            sumd2 += arr[i][n - 1 - i];
        }

        if (sumd1 != sumd2)
            return false;

        for (int i = 0; i < n; i++) {

            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            if (rowSum != colSum || colSum != sumd1)
                return false;
        }
        return true;
    }
}
