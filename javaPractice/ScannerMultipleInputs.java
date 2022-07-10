
/*
 * Reference: YouTube -> https://www.youtube.com/watch?v=fJLHKbVx-YQ,  https://www.youtube.com/watch?v=_xqzmDyLWvs
 * Reference: GFG -> https://www.geeksforgeeks.org/?p=337103 
 * Explanation: Why is Scanner skipping nextLine() after use of other next functions?
 * This program is all about taking multi-line input from user using Scanner.
 */
import java.util.*;

public class ScannerMultipleInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
            int arraysize = sc.nextInt();
            int[] arr = new int[arraysize];
            for (int j = 0; j < arraysize; j++) {
                arr[j] = sc.nextInt();
            }

            int max = 0;
            int count = 0;
            for (int j = 1; j < arraysize; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }

            for (int j = max; j < arraysize; j++) {
                count++;
            }
            System.out.println("count " + count);
        }
    }

}
