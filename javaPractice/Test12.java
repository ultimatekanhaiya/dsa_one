import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get hailstoneSequence");
        int number = sc.nextInt();
        hailstoneSequence(number);

    }

    static void hailstoneSequence(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                System.out.println(n + " is even so i take half : " + n / 2);
                n = n / 2;
            } else {
                System.out.println(n + " is odd so i make 3n+1 : " + (n * 3 + 1));
                n = n * 3 + 1;
            }
            count++;
        }
        System.out.println("There are total " + count + " steps to reach 1");

    }
}
