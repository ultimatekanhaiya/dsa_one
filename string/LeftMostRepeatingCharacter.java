public class LeftMostRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abccb";
        System.out.println(leftMostRepeatingChar(s));
    }

    public static int leftMostRepeatingChar(String s) {
        int charac = 265;
        boolean[] arr = new boolean[charac];
        int res = -1;
        for (int i = s.length() - 1; i > -1; i--) {
            if (arr[s.charAt(i)]) {
                res = i;
            } else {
                arr[s.charAt(i)] = true;
            }
        }
        return res;
    }
}
