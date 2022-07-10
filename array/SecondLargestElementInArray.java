/*
 * source(geeksforgeeks-youtube)
 * 
 * TOPIC-> SecondLargestArrayElementIndex.
 * 
 * Note- many time we focus on max values but sometime we have to take that value index in max variable rather than its
 *       value. 
 * Ex- int max = arr[i]; is wrong
 *     int max = i; is right
 * 
 * We saved index i in max variable because sometime it is good for comparision like arr[i] > arr[max]
 * and we can easily change it by new max value.     
 */

public class SecondLargestElementInArray {
	public static void main(String[] args) {
		int[] arr = { 11, 10, 4, 9, 9, 9, 8 };
		System.out.println(findSecondLargest2(arr));
	}

	// Method 1 -> naive solution using two for loops
	static int findSecondLargest(int[] arr) {
		int max = 0;
		int res = -1;

		// first find index of max
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		System.out.println(max);
		// using index of max find second max
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[max]) {
				if (res == -1) {
					res = i;
				} else if (arr[i] > arr[res]) {
					res = i;
				}
			}
		}

		return res;
	}

	// Method 2. Pro way -> using only single for loop

	static int findSecondLargest2(int[] arr) {
		int res = -1;
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				res = max;
				max = i;
			} else if (arr[i] < arr[max]) {
				// it may be possible that max value didn't updated and hence res also
				// so arr[res] = arr[-1] which result in exception. Ex- [10,10,4] max = 0, res
				// firstly = -1 then 2 finally.
				if (res == -1 || arr[i] > arr[res]) {
					res = i;
				}
			}
		}
		return res;
	}

}
