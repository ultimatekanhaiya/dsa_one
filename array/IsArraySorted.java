public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1 };
        System.out.println(isArraySorted(arr));
    }

    // method 1
    public static boolean isArraySorted(int[] arr) {
        boolean flagAscending = true;
        boolean flagDescending = true;

        // loop for checking Ascending array sorting
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] < arr[i])) {
                flagAscending = false;
                break;
            }
        }
        // loop for checking Descending array sorting
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] > arr[i])) {
                flagDescending = false;
                break;
            }
        }
        return (flagAscending || flagDescending) ? true : false;
    }

    // method 2
    public static int isSorted(int[] arr, int n) {
        if (arr[0] > arr[n - 1]) { // for descending
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    return 0;
                }
            }
        } else if (arr[0] < arr[n - 1]) { // for ascending
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return 0;
                }
            }
        } else { // for same elements
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    return 0;
                }
            }
        }
        return 1;
    }

}
