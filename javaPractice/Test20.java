import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find even or odd");
        int n = sc.nextInt();
        evenOdd(n);
    }

    public static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
