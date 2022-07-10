
public class ReverseNotEffectSpecialChar {
	public static void main(String[] args) {

		String s = "Ab,c,de!$";
		String result = revrseNotEffectSpecial(s);
		System.out.println(result);
	}

	public static String revrseNotEffectSpecial(String s) {
		String k = "";
		for (int i = s.length() - 1; i > -1; i--) {
			if ((Character.isDigit(s.charAt(i))) || (Character.isLetter(s.charAt(i)))) {
				k += s.charAt(i); // Character.toString(s.charAt(i));
			}
		}
		// System.out.println(k);

		StringBuffer sb = new StringBuffer(s);
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((Character.isDigit(s.charAt(i))) || (Character.isLetter(s.charAt(i)))) {
				if (k.length() > j) {
					sb.setCharAt(i, k.charAt(j));
					j++;
				}
			}
		}
		// System.out.println(sb);
		return sb.toString();
	}

}
