/*
 * 
 * Our Task: Given an array arr[] of integers, find out the maximum difference between any two elements 
 * such that the larger element appears after the smaller number.  
 * Examples : 
 *
 * Input : arr = {2, 3, 10, 6, 4, 8, 1}
 * Output : 8
 * Explanation : The maximum difference is between 10 and 2.
 * Input : arr = {7, 9, 5, 6, 3, 2}
 * Output : 2
 * Explanation : The maximum difference is between 9 and 7.
 *
 */

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 4, 6, 4, 8, 1 };
        System.out.println(maxDifference(arr));
    }

    public static int maxDifference(int[] arr) {
        int res = Integer.MIN_VALUE;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - min > res) {
                res = arr[i] - min;
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return res;

    }
}
