/*
 * INSERTION SORT
 * Time-Complexity
 * Best-case = O(n) when array is sorted
 * Worst-case = O(n^2) when array is reversely sorted
 * Average-case = O(n^2)
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 9, 5 };
		arr = insertSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];// storing value
			int hole = i;// storing index

			while (hole > 0 && arr[hole - 1] > value) {
				arr[hole] = arr[hole - 1];
				hole--;
			}
			arr[hole] = value;
		}
		return arr;
	}

}
