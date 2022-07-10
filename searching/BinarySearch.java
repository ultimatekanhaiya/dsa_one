
//BinarySearch
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("enter " + size + " elements in array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("enter element to search in array");
		int element = sc.nextInt();

		int index = BinarySearch.search(array, size, element);

		if (index != -1) {
			System.out.println("element found at index " + index);
		} else {
			System.out.println("element not found");
		}
	}

	public static int search(int[] array, int size, int element) {
		int start = 0;
		int end = size - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == element) {
				return mid;
			} else if (element < array[mid]) {
				end = mid - 1;
			} else if (element > array[mid]) {
				start = mid + 1;
			}
		}
		return -1;
	}
}
