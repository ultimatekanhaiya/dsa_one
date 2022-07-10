import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        System.out.println(reverseOrder(number));

    }

    static int reverseOrder(int n) {
        int result = 0;
        while (n != 0) {
            int remainder = n % 10;
            result = result * 10 + remainder;
            n = n / 10;
        }
        return result;
    }
}
