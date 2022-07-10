/*
*Reference  : https://stackoverflow.com/questions/34478006/how-to-add-an-array-into-set-properly
* Intersection means only those elements which are common to both sets
* mostly denote by 'and' 
*/

import java.util.*;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = { 10, 10, 30, 20 };
        int[] arr2 = { 20, 10, 40, 10, 40 };// here 10,20 are common to both sets
        System.out.println(intersections(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
    }

    // Pro implementation
    public static int intersection(int[] arr1, int[] arr2) {
        int res = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int v : arr1) {
            hs.add(v);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                hs.remove(arr2[i]);
                res++;
            }
        }

        return res;
    }

    // Naive implementation
    public static int intersections(int[] arr1, int[] arr2) {

        int res = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr1[j] == arr1[i]) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                continue;
            for (int k = 0; k < arr2.length; k++) {
                if (arr1[i] == arr2[k]) {
                    res++;
                    break;
                }
            }

        }
        return res;
    }

}
