public class DiamondPattern {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k > i; k--) {
				System.out.print("*");
			}
			for (int l = 3; l > i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
