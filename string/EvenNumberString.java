/**
 * Here we are trying to find number of even substrings in the given string.
 */
public class EvenNumberString {
    public static void main(String[] args) {
        String s = "1234";// 12,2,1234,234,34,4
        System.out.println(countEvenNumber(s));
    }

    static int countEvenNumber(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0'; // here we minus char 0 because we don't want ascii value of character.
            if (n % 2 == 0) {
                count += 1 + i;
            }
        }
        return count;
    }

}
