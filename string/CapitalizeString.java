public class CapitalizeString {
	public static void main(String[] args) {
		String s = "faliure is just practice for success";
		String s2 = "is practice";
		String result = capString(s, s2);
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

}
