/*
*  source -> geeksforgeeks
 * complexity time -> O(n)
 *            space -> O(1)
 * 
 * TOPIC -> Equilibrium Point in an array
 * 
 * An equilibrium point in an array is that point where the sum of all elements in left == sum of all elements in right.
 * There can be multiple equilibrium points in an array but we have to print the first one only.
 * 
 */

public class EquilibriumPoint {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 4, 1 };
		System.out.println(equilibriumPoint(arr));
	}

	static int equilibriumPoint(int[] arr) {
		if (arr.length == 1)
			return 1;
		else {
			// making prefix sum_array
			for (int i = 1; i < arr.length; i++) {
				arr[i] = arr[i - 1] + arr[i];
			}

			// finding equilibrium point
			for (int i = 1; i < arr.length - 1; i++) {
				if (arr[i - 1] == arr[arr.length - 1] - arr[i])
					return i + 1;
			}
		}
		return -1;

	}

}
