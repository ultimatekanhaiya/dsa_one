
/*
 * Reference: https://howtodoinjava.com/java/array/union-between-two-arrays/ 
 * Explanation: Here we are not just printing union of two arrays using HashSet but returning array instead
 * 
 */
import java.util.*;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = { 10, 5, 20, 15, 25, 30 };
        int[] arr2 = { 50, 12, 5, 30, 15, 70 };
        int[] arr3 = unionArray(arr1, arr2);

        System.out.println(Arrays.toString(arr3));
    }

    static int[] unionArray(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr1) {
            set.add(x);
        }

        for (int x : arr2) {
            set.add(x);
        }

        // convert to array
        Integer[] union = {};
        union = set.toArray(union);

        int[] arr = new int[union.length];
        for (int i = 0; i < union.length; i++) {
            arr[i] = union[i];
        }

        return arr;
    }
}
