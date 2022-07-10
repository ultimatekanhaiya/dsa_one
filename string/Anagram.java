
/**
 * An anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once
 */
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "tslieN";

        System.out.println(isAnagram2(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] arr = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // ! Navie Approach
    /**
     * first check length of both the strings must be equal and then sort both
     * string if they are equal then it means they are anagram of each other
     */
    public static boolean isAnagram2(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        s1 = new String(c1);

        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        s2 = new String(c2);

        return s1.equals(s2);
    }

}
