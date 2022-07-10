/**
 * Time complexity of naive implementation O(n-m+1)*m or O(n^2)
 */
// ! Naive Approach
public class PatternSearching {
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "eks";
        naivePatternSearch(txt, pat);
    }

    public static void naivePatternSearch(String txt, String pat) {
        int j;
        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            for (j = 0; j < pat.length(); j++) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    break;
                }
            }
            if (j == pat.length()) {
                System.out.println(i);
            }
        }
    }

    // ! Pro Approach

}
