/*
 * bro ur mad 
 * 1. StringBuffer doesn't override toStirng method for content comparison
 * 2. you can't compare StringBuffer with String both are different.
 * 3. method to reverse a string
 * 3.1 "Reversed #1:" + sb.reverse().toString());
 * 3.2 "Reversed #2:" + StringUtils.reverse(str)); did not work because of import 
 *      problem.
 */

//import com.sun.tools.javac.util.StringUtils;

public class Stringpalindrome2 {
	public static void main(String[] args) {
		String s = "this is 11";
		String[] sarr = s.split(" ");
		int count = 0;
		for (int i = 0; i < sarr.length; i++) {
			StringBuffer sb = new StringBuffer(sarr[i]);
			String l = sb.reverse().toString();
			if (sarr[i].equals(l)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
