/*
 * Reference: YouTube -> HelloWorld = https://www.youtube.com/watch?v=ENcnXXiRT6E&t=166s
 * Time complexity: O(n)
 * Space complexity: O(1)
 * Array rotation by reversing the two different parts of array and then finally reverse it from start to end.
 * we can rotate array in clockwise and anti-clockwise direction.
 * Easier than jugglingArrayRotation method
 */

public class ArrayRotationReverseMethod {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int rotation = 3;
		int n = arr.length;

		/*
		 * clockwise rotation/right_hand side reverseArray(arr, 0, n-1-rotation)
		 * reverseArray(arr, n-rotation, n-1); reverseArray(arr, 0, n-1)
		 */

		// anti-clockwise/left_hand side
		rotation = rotation % n;
		reverseArray(arr, 0, rotation - 1);
		reverseArray(arr, rotation, n - 1);
		reverseArray(arr, 0, n - 1);

		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

	static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}