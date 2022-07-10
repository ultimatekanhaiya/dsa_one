//IMPORTANT 
/*
 * finding counts of positive, negative & zero numbers in array and dividing
 * those counts with array_size which should be correct upto 4 decimal places.
 * 
 * If we just want to print a decimal number with n digits after decimal point,
 * we can simply format the output String:
 * for this we can use the 'BigDecimal' class.
 */

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int k = sc.nextInt();
		System.out.println("enter " + k + " elements in array");
		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}
		plusMinus(arr);
	}

	static void plusMinus(int[] arr) {
		double positive = 0;
		double negative = 0;
		double zero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positive++;
			} else if (arr[i] < 0) {
				negative++;
			} else {
				zero++;
			}
		}
		System.out.printf("%.4f %n", positive / arr.length);
		System.out.printf("%.4f %n", negative / arr.length);
		System.out.printf("%.4f %n", zero / arr.length);
	}
}
