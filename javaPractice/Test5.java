import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        int[] arr1 = { 3, 2, 8, 15, -8 };
        int sum = 17;
        System.out.println(naiveFindPair(arr1, sum));
    }

    public static boolean findPairOfSum(int[] arr, int sum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int x : arr) {
            if (hs.contains(sum - x))
                return true;
            else {
                hs.add(x);
            }
        }
        return false;
    }

    // naive approach
    public static boolean naiveFindPair(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum)
                    return true;
            }
        }
        return false;
    }

}
