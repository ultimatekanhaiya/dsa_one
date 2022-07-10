
public class Test9 {
    public static void main(String[] args) {
        var a = 10;
        int b = 4;
        String s12 = a + b;
        int String = 5;
        String s = "silent";
        String s2 = "tsilen";
        System.out.println(isAnagram(s, s2));
        System.out.println(a + "we");
    }

    static boolean isAnagram(String s, String s2) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a']--;
        }
        for (int x : arr) {
            if (x != 0)
                return false;
        }
        return true;
    }

}
