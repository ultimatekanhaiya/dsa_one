import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number to get factorial");
        int fact = sc.nextInt();
        System.out.println("Factorial of " + fact + " is " + factorial(fact));

    }

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

}
