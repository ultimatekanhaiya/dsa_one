import java.util.*;

public class LeftMostNonReaptingCharacter {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(leftMostNonRepeatingChar(s));
    }

    public static int leftMostNonRepeatingChar(String s) {
        int[] arr = new int[256];
        int res = Integer.MAX_VALUE;
        Arrays.fill(arr, -1);
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] == -1) {
                arr[s.charAt(i)] = i;
            } else {
                arr[s.charAt(i)] = -2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > -1) {
                res = Math.min(arr[i], res);
            }
        }
        return res;
    }

}
