/*
 * This question teaches us how to convert Roman number to integer
 * 1.we create a HashMap and store important key-value pairs in it
 * 2. split the string and run for loop over array and check value in HashMap
 * 3.If successive element of array is greater than current element then subtract that element
 * otherwise add all values to get result.
 */

import java.util.HashMap;

public class RomanStringToInteger {
	public static void main(String[] args) {
		String s = "xiii";
		s = s.toUpperCase();
		RomanToInteger(s);
		// System.out.println(RomanToInteger(s));
	}

	static void RomanToInteger(String s) {
		int n = 0;
		HashMap<String, Integer> m = new HashMap<String, Integer>();

		m.put("I", 1);
		m.put("V", 5);
		m.put("X", 10);
		m.put("L", 50);
		m.put("C", 100);
		m.put("D", 500);
		m.put("M", 1000);

		String[] arr = s.split("");

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (m.get(arr[i]) != null) {
				if (i < arr.length - 1 && m.get(arr[i]) < m.get(arr[i + 1])) {
					n += -(m.get(arr[i]));

					// System.out.println("n " + n + " m " + m.get(arr[i]));
				} else {
					n += Integer.valueOf(m.get(arr[i]));
					// System.out.println("n " + n + " m " + m.get(arr[i]));
				}
			} else {
				count++;
				break;
			}
		}

		if (count > 0)
			System.out.println("roman number doesn't exist");
		else
			System.out.println(n);
	}

}
