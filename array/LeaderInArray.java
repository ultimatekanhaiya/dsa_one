/*
 * source -> geeksforgeeks
 * complexity -> time = O(n)
 *               space = O(n)
 *TOPIC-> Leaders in an Array
 * 
 * An element in array is said to be leader if all elements on its right are smaller than it.
 * There can be any number of Leaders in an array
 * last element will always be leader.
 */

import java.util.*;

public class LeaderInArray {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = { 16, 17, 17, 17, 4, 3, 5, 2 };
        System.out.println(leaders(arr, n));
    }

    // function to find leaders in array
    static ArrayList<Integer> leaders(int arr[], int n) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        int max = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                al.add(0, max);
            }
        }
        // Collections.reverse(al);
        return al;
    }

}
