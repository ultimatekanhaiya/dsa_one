
public class IndexbaseReferencing {
	public static void main(String[] args) {
		int[] arr = { 12, 3, 1, 2, 6, 7, 10 };
		indexBaseReference(arr);
		for (int l : arr) {
			System.out.print(l + " ");
		}
	}

	static int[] indexBaseReference(int[] arr) {
		int n = arr.length;
		int i = 0;
		while (i < n) {
			if (arr[i] <= n && arr[i] != i + 1) {
				int temp = arr[arr[i] - 1];
				arr[arr[i] - 1] = arr[i];
				arr[i] = temp;
			} else {
				i++;
			}
		}
		return arr;
	}

}
