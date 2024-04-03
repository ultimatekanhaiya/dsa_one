import java.util.Arrays;

public class LeftMostRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abccb";
        System.out.println(leftMostRepeatingChar(s));
    }

    // best solution
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

    // soltion 2
    static int leftMostRepeatChar(String s) {

        int[] arr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] > 1) {
                return i;
            }
        }
        return -1;
    }

    // solution 3
    static int leftMostRepeatChar2(String s) {

        int result = Integer.MAX_VALUE;
        int[] arr = new int[256];
        Arrays.fill(arr, -1);
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] == -1) {
                arr[s.charAt(i)] = i;
            } else {
                result = Math.min(result, i);
            }

        }
        return (result == Integer.MAX_VALUE) ? -1 : result;
    }
}
