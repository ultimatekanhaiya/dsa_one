public class ReverseAlphabetOrder {
    public static void main(String[] args) {
        String s = "rznyzxp";
        reverseAlphabet(s);
    }

    static void reverseAlphabet(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            int k = 'z' - s.charAt(i);
            int l = 'a' + k;
            sb.setCharAt(i, (char) l);
        }
        System.out.println(sb);
    }
}
