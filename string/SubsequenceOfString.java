/**
 ** Here we are trying to find subsequence s1 in s string. There is small
 ** difference between subsequence and substring that substring is always
 ** contiguous but subsequence is non contiguous. Number of subsequence formed
 * from a string are 2^n
 */
public class SubsequenceOfString {
    public static void main(String[] args) {
        String s = "ABDCDEF";
        String s1 = "ADEF";
        System.out.println(isSubsequence(s, s1));
    }

    public static boolean isSubsequence(String s, String s1) {

        if (s.length() < s1.length())
            return false;

        int j = 0;
        for (int i = 0; i < s.length() && j < s1.length(); i++) {
            if (s.charAt(i) == s1.charAt(j)) {
                j++;
            }
        }
        return (j == s1.length());
    }
}