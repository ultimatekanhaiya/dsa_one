package dp;

public class DPFibonacci {

    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[n + 1];
        System.out.println(fib(n, arr));
    }

    public static int fib(int n, int[] arr) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = fib(n - 1, arr) + fib(n - 2, arr);
        return arr[n];

    }
}