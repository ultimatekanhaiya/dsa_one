public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 4, 6, 4, 8, 1 };
        System.out.println(maxDifference(arr));
    }

    public static int maxDifference(int[] arr) {
        int res = Integer.MIN_VALUE;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - min > res) {
                res = arr[i] - min;
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return res;

    }
}
