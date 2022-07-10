
/*
 * Reference: https://www.tutorialcup.com/java/how-to-limit-decimal-places-in-java.htm
 * Explanation: 
 * 
 */
import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        calcFigureArea();
    }

    static void calcFigureArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please choose one of the below options");
        System.out.println("press 1 for Triangle");
        System.out.println("press 2 for Square");
        System.out.println("press 3 for Rectangle");
        System.out.println("press 4 for Circle");

        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("enter side and height of Triangle");
                double side = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.format("area of Triangle is :%.2f", (side * height / 2));
                break;
            case 2:
                System.out.println("enter side of square");
                double sides = sc.nextDouble();
                System.out.format("area of Square is : %.2f", sides * sides);
                break;
            case 3:
                System.out.println("enter length and breadth of Rectangle");
                double len = sc.nextDouble();
                double bre = sc.nextDouble();
                System.out.format("area of Rectangle is : %.2f", len * bre);
                break;
            case 4:
                System.out.println("enter radius of circle");
                double radius = sc.nextDouble();
                System.out.format("area of Circle is : %.2f", radius * radius * 3.14);
                break;
            default:
                System.out.println("enter valid choice");
        }

    }
}
