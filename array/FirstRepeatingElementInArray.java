/*
 * Reference: GFG ->  https://www.geeksforgeeks.org/java-program-to-count-the-occurrence-of-each-character-in-a-string-using-hashmap/
 * Time complexity: O(n)
 * Space complexity: O(n)
 * 
*/

import java.util.HashMap;

public class FirstRepeatingElementInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 3, 2, 3, 5 };
        System.out.println(firstRepeatingElement(arr));
    }

    static int firstRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else
                hm.put(i, 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) > 1)
                return i + 1;// returning 1 based index not value
        }
        return -1;
    }
}
