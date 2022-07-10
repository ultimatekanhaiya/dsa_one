import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        greet(name);
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
