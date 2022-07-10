import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number to get table of");
        int number = sc.nextInt();
        printTable(number);
    }

    static void printTable(int n) {
        for (int i = 1; i < 13; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}
