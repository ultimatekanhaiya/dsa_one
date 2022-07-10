
/*
 * Reference: GFG -> https://practice.geeksforgeeks.org/tracks/P100-Mathematics/?batchId=238&tab=1
 * Time complexity: O(n log logn) near about linear complexity
 * Space complexity: O(1)
 * Find Prime Number in given Range (Sieve of Eratosthenes)
 * Explain -> Instead of moving one by one, divide the array in different sets, 
 * where number of sets is equal to GCD of N(size of array) and K(rotation) and move the elements within sets.
 */
import java.util.*;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        printPrimeInRange(a, b);
    }

    static void printPrimeInRange(int a, int b) {
        boolean[] arr = new boolean[b + 1];
        Arrays.fill(arr, true);
        // we started with 2 because it is the smallest Prime Number
        for (int i = 2; i <= b; i++) {
            if (arr[i]) {
                if (i >= a) {// this condition helps to print prime number in given range
                    System.out.print(i + " ");
                }

                for (int j = i * i; j <= b; j = j + i) { // 2*2,4+2,6+2,8+2....(4,6,8,10,12...)
                    arr[j] = false; // 3*3, 9+3, 12+3.... (9,12,15,18...)
                                    // 5*5, 25+5, 30+5... (25,30,35,40....)
                }
            }
        }
    }

}
