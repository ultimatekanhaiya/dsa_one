public class Fibonacci {
    public static void main(String[] args) {
        int sum = fib(3);
        // System.out.println(sum);
        System.out.println(sumNatural(5, 0));
    }

    // fabonacci series
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    // sum of n natural numbers(tail recursive)
    static int sumNatural(int n, int k) {
        if (n == 0)
            return k;
        return sumNatural(n - 1, k + n);
    }

}
