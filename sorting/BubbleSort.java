/*
 * BUBBLE SORT
 * Time-complexity
 * Best-case = O(n) when array is already sorted
 * Average-case = O(n^2)
 * Worst-case = O(n^2)
 * Inplace sorting algo
 */

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 5, 3 };
		arr = bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length - 1 - i; j++)
			// i is minused because after every pass maximum number will bubble up and
			// minimum i length of array is
			// sorted then why compare uselessly EX- after two passes array will be look
			// like-{2,4,1,3,5,7}
			{
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		return arr;
	}

}
