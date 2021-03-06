public class RopeCutting {
    public static void main(String[] args) {
        System.out.println(cutRope(23, 12, 9, 11));
    }

    static int cutRope(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;

        int res = Math.max(cutRope(n - a, a, b, c), Math.max(cutRope(n - b, a, b, c), cutRope(n - c, a, b, c)));
        if (res == -1)
            return -1;
        return res + 1;
    }

}
