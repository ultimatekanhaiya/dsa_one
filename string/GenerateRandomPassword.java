
/*
 * Reference: https://www.tutorialspoint.com/Generating-password-in-Java
 * Explanation: 
 * 
 */
import java.util.*;

public class GenerateRandomPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your age");
        String age = sc.next();
        System.out.println("enter your id");
        String id = sc.next();
        System.out.println("set length of password");
        int len = sc.nextInt();

        System.out.println(generatePassword(name, age, id, len));
    }

    static char[] generatePassword(String name, String age, String id, int len) {
        // String password = "";
        String combinedChars = name + age + id;
        Random random = new Random();
        char[] password = new char[len];

        password[0] = name.charAt(random.nextInt(name.length()));
        password[1] = age.charAt(random.nextInt(age.length()));
        password[2] = id.charAt(random.nextInt(id.length()));

        for (int i = 3; i < len; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }
}
