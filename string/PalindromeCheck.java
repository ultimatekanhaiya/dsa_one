public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "abctpcba";
        System.out.println(palindromeCheck(s));
    }

    public static boolean palindromeCheck(String s){
        int i = 0;
        int j = s.length() -1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}
