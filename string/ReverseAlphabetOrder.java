public class ReverseAlphabetOrder {
    public static void main(String[] args) {
        String s = "rznyzxp";
        reverseAlphabet(s);
    }

    static void reverseAlphabet(String s){
        StringBuffer sb = new StringBuffer(s);
        int n = 122;
        for(int i = 0; i < s.length(); i++){
            int k = n - s.charAt(i);
            int l = 97 + k;
            sb.setCharAt(i,(char)l);
        }
        System.out.println(sb);
    }
}
