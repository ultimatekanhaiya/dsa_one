public class CalcPowerInLogTime {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        int k = power(x, n / 2);
        if (n % 2 == 0)
            return k * k;
        else
            return x * k * k;
    }

}
