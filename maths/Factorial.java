import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to find factorial");
		int n = sc.nextInt();
		System.out.println(fact(n));
	}

	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			n = n * fact(n - 1);
			if (n == 1) {
				return n;
			}
		}

		return n;
	}

}
