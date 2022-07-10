public class PalindromeCheckRecursive {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s, 0, s.length() - 1));

    }

    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end)
            return true;
        return (s.charAt(start) == s.charAt(end) && isPalindrome(s, start + 1, end - 1));

    }

}
