import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius to find area of circle");
		int radius = sc.nextInt();
		float area = radius * radius * (float) Math.PI;
		System.out.println(area);
	}

}
