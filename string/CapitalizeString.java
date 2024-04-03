import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeString {
	public static void main(String[] args) {
		String s = "faliure is just practice for success";
		String s2 = "is practice";
		String result = capStringPro(s, s2);
		System.out.println(result);
	}

	public static String capString(String s, String s2) {
		String result = "";
		String[] sarr = s.split(" ");
		String[] sarr2 = s2.split(" ");

		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = sarr[i].substring(0, 1).toUpperCase() + sarr[i].substring(1);

			for (int j = 0; j < sarr2.length; j++) {
				if (sarr[i].equalsIgnoreCase(sarr2[j])) {
					sarr[i] = sarr[i].substring(0, 1).toLowerCase() + sarr[i].substring(1);
					break;
				}
			}
		}

		for (int i = 0; i < sarr.length; i++) {
			result += sarr[i] + " ";
		}
		return result;
	}

	// Stream way
	public static String capStringPro(String s1, String s2) {

		String[] sarr1 = s1.split(" ");
		String[] sarr2 = s2.split(" ");

		return Arrays.stream(sarr1).map(s -> Arrays.stream(sarr2).anyMatch(s::equals) ? s : capitalizeFirstChar(s))
				.collect(Collectors.joining(" "));

	}

	public static String capitalizeFirstChar(String s) {
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

}
