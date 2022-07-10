public class PatternSearchForDistinctElements {
    public static void main(String[] args) {
        String txt = "gksforgks";
        String pat = "eks";
        patternSearchForDistinctElements(txt, pat);
    }

    public static void patternSearchForDistinctElements(String txt, String pat) {
        int t = txt.length();
        int p = pat.length();
        int j;
        for (int i = 0; i <= t - p;) {
            for (j = 0; j < p; j++) {

                if (pat.charAt(j) != txt.charAt(i + j)) {
                    break;
                }
            }

            if (j == pat.length()) {
                System.out.println(i);
            }
            if (j > 0) {
                i += j;
            } else {
                i++;
            }

        }
    }
}
