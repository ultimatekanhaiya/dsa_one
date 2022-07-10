public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 13, 5, 17, 8, 9 };
        System.out.println(max(arr, 0));
    }

    public static int max(int[] arr, int idx) {
        if (idx == arr.length - 1)
            return arr[idx];

        int misa = max(arr, idx + 1);

        if (misa > arr[idx])
            return misa;
        else
            return arr[idx];
    }

}
