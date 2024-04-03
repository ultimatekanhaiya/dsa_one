public class Pattern_printing11 {
	public static void main(String[] args) {
		String s = "5";
		PrintPattern(s);
	}

	static void PrintPattern(String s) {
		int k = Integer.parseInt(s);
		int p = 1;

		for (int i = 0; i < k; i++) {
			for (int j = k; j > 0; j--) {
				if (p == j) {
					System.out.print("*");
				} else
					System.out.print(j);
			}
			p++;
			System.out.println("");
		}

	}

}
