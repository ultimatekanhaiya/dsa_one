import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println(isPrime(n));

    }

    static boolean isPrime(int number) {
        if (number < 2)
            return false;
        if (number == 2 || number == 3)
            return true;
        if (number % 2 == 0 || number % 3 == 0)
            return false;
        for (int i = 5; i * i <= number; i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
        }
        return true;

    }
}
