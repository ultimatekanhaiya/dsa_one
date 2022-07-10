import java.util.Scanner;
import java.util.regex.*;

public class StringValidate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        // System.out.println(s);
        String[] arr = new String[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.next();
            // System.out.println(arr[i]);
        }
        stringValidate(arr);
    }

    public static void stringValidate(String[] arr) {
        String reg = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$";

        Pattern p = Pattern.compile(reg);

        for (int i = 0; i < arr.length; i++) {
            Matcher m = p.matcher(arr[i]);
            if (m.matches()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
