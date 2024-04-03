public class Pattern_printing8 {
	public static void main(String[] args) {
		for (int l = 9; l > 0; l--) {
			for (int m = l; m < 10; m++) {
				System.out.print(m);
			}
			System.out.print("0");
			System.out.println();
		}
	}
}