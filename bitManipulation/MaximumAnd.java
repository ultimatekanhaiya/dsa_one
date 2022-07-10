public class MaximumAnd {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        System.out.println(maxAnd(a.length, a));
    }

    static int maxAnd(int N, int[] A) {
        int result = 0;
        for (int i = 0; i < N - 1; i++) {
            int a = A[i];
            int b = A[i + 1];

            int c = a & b;
            if (c == 0) {
                // incomplete result
            }
        }
        return result;
    }

}
