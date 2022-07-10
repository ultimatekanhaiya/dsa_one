/**
 * printing frequency of character(in sorted order) of given string in lower
 * case
 */
public class PrintFrequencyOfCharcterInString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printFrequencyOfCharcter(s);
    }

    public static void printFrequencyOfCharcter(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println((char) (i + 'a') + " " + arr[i]);
            }
        }
    }
}
