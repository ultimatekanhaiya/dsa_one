public class GetSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        getSubsequence(s, "", 0);
    }

    public static void getSubsequence(String s, String cur, int i) {
        if (i == s.length()) {
            System.out.println(cur);
            return;
        }
        getSubsequence(s, cur, i + 1);
        getSubsequence(s, cur + s.charAt(i), i + 1);
    }

}
