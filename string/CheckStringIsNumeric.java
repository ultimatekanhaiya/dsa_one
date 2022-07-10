/**
 * Character class Methods ---------------- isLetter(char ch), isDigit(char ch),
 * isWhitespace(char ch), isUpperCase(char ch), isLowerCase(char ch)
 * toUppercase(char ch), toLowerCase(char ch), toString(char ch)
 */
public class CheckStringIsNumeric {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(isNumeric1(s));
        System.out.println(isNumeric2(s));
    }

    // method 1
    public static boolean isNumeric1(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // method 2
    public static boolean isNumeric2(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }
}