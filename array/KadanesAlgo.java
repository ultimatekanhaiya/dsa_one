/*
 * source -(YouTube - prepCoding) V.V.IMPORTANT
 * complexity: time -> O(n)
 *             space -> O(1)
 * TOPIC -> Kadane's Algorithm
 * Problem: find contiguous sub array whose sum is max
 */

public class KadanesAlgo {
	public static void main(String[] args) {
		int[] arr = { 74, -72, 94, -53, -59, -3, -66, 36, -13, 22, 73, 15, -52, 75 };
		System.out.println(maxSubArraySum(arr));
	}

	static int maxSubArraySum(int[] arr) {
		int current = arr[0];
		int overall = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (current > 0) {
				current += arr[i];
			} else {
				current = arr[i];
			}
			if (current > overall) {
				overall = current;
			}
		}

		return overall;
	}

}
