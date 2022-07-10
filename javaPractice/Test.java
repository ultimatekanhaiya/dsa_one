public class Test {
    public static void main(String[] args) {
        String s = "a2b3c10";

    }

    public static void trytest(String s) {
        String g = Character.toString(s.charAt(0));
        String result = "";
        String k = "";
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                k += s.charAt(i);
            } else {
                n = Integer.parseInt(k);
                for (int j = 0; j < n; j++) {
                    System.out.print(g);
                }
            }
        }
    }

}
