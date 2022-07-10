import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 3, 3 };
        System.out.println(fRE(arr));
    }

    public static int fRE(int[] arr) {
        int result = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (int i = 0; i < hm.size(); i++) {
            if (hm.get(arr[i]) > 1) {
                return i;
            }
        }
        return result;
    }
}
