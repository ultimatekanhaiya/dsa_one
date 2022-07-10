/*
 * Reference
 * Union: denoted as 'or' and take only distinct elements
 * x = {3,12,5,3,13} y = {14,15,6,3} so x u y = {3,12,5,6,13,14,15};
 */

import java.util.*;

public class UnionofTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 15, 20, 5, 15 };
        int[] arr2 = { 15, 15, 15, 20, 10 };
        System.out.println(unionofArrays(arr1, arr2));

    }

    public static int unionofArrays(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int x : arr1) {
            hs.add(x);
        }
        for (int x : arr2) {
            hs.add(x);
        }
        return hs.size();
    }

}
