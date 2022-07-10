/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * reversing array by swapping start and end element and incrementing start and decrementing end.
 * using temp to store start element
 * 
 */

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		reverse(arr);
		for (int g : arr) {
			System.out.print(g + " ");
		}
	}

	static int[] reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

}
