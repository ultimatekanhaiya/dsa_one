/*
 * Reference: GFG -> https://www.geeksforgeeks.org/trapping-rain-water/ ,YouTube-> https://www.youtube.com/watch?v=F4d15bMiYEQ&t=943s 
 * Time complexity: O(n)
 * Space complexity: O(1)
 * amount of water trapped by wall of value stored in array
 */

public class TrappingRainWater {
	public static void main(String[] args) {
		int[] array = { 3, 0, 0, 1, 4, 3, 1, 0, 2 };
		System.out.println(trappingRain(array));
	}

	static int trappingRain(int[] arr) {
		int result = 0;
		int leftMax = 0;
		int rightMax = 0;
		int lo = 0;
		int hi = arr.length - 1;
		while (lo < hi) {
			if (arr[lo] < arr[hi]) {
				if (arr[lo] > leftMax)
					leftMax = arr[lo];
				else {
					result += leftMax - arr[lo];
					lo++;
				}
			} else {
				if (arr[hi] > rightMax)
					rightMax = arr[hi];
				else {
					result += rightMax - arr[hi];
					hi--;
				}
			}
		}
		return result;
	}
}
