/*
 * SELECTION SORT
 * Time complexity = O(n^2)
 * Inplace sorting algo
 * In selection sort we try to find 1st minimum element and swap that element with element at index 0;
 * similarly we find second min element swap that element with element at index 1 and so on until whole array is sorted.
 */

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 5, 3, 10, 9 };
		arr = selectSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;// update the index of minimum element
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}

}
