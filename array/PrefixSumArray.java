
public class PrefixSumArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		prefixSumArray(arr);
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

	static void prefixSumArray(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i];
		}
	}

}
