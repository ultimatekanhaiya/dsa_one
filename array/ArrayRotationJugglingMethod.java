/*
 * Reference: YouTube -> CodeWhoop = https://www.youtube.com/watch?v=utE_1ppU5DY, GFG = https://www.geeksforgeeks.org/array-rotation/
 * Time complexity: O(n)
 * Space complexity: O(1)
 * Array rotation using juggling technique(anti-clockwise)
 * Explain -> Instead of moving one by one, divide the array in different sets, 
 * where number of sets is equal to GCD of N(size of array) and K(rotation) and move the elements within sets.
 */

public class ArrayRotationJugglingMethod {
	public static void main(String[] args) {
		int rotation = 5;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		arrayRotation(rotation, arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	// method for arrayRotation
	static int[] arrayRotation(int rotate, int[] arr) {
		int gcd = gcd(rotate, arr.length);

		for (int i = 0; i < gcd; i++) {
			int n = arr.length;
			int j = i;
			int temp = arr[i];

			while (true) {
				int d = (j + rotate) % n;// calculating indexes of elements in each set so to move it on correct place.

				if (d == i)// When no element left to traverse in particular set then break loop.
					break;

				arr[j] = arr[d];
				j = d;

			}
			arr[j] = temp;
		}
		return arr;
	}

	// method for HCF/GCD
	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		else
			return gcd(b % a, a);
	}

}
