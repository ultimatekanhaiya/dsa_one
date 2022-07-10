/*
 *Quick Sort( reference geeksforgeeks and programiz)
 *Time-Complexity
 * Best-case = O(nlogn) when array is sorted
 * Worst-case = O(n^2) when array is reversely sorted
 * Average-case = O(nlogn)
 * 
 * Quick Sort is considered better than merge sort inspite of having O(n^2) worst case as compared to O(nlogn) in merge
 * because it is an IN-Place o(1) sorting algo where as merge is not o(n).
 * 
 * The worst case of quick sort is almost always avoided by using Randomized version of Quick Sort.
 */

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 10, 7, 8, 9, 1, 5, 5, 5 };
		int n = arr.length;

		//QuickSort ob = new QuickSort();
		sort(arr, 0, n - 1);

		System.out.println("sorted array");
		printArray(arr);
	}

	// method to print array
	static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	// The main method that implements QuickSort
	public static int[] sort(int[] array, int start, int end) {
		if (start < end) {
			int pi = partition(array, start, end);

			sort(array, start, pi - 1);
			sort(array, pi + 1, end);
		}
		return array;
	}

	static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = (start - 1);
		for (int j = start; j < end; j++) {
			if (array[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		// swap arr[i+1] and arr[end] (or pivot)
		int temp = array[i + 1];
		array[i + 1] = array[end];
		array[end] = temp;

		return i + 1;
	}
}
