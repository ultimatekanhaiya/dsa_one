public class IsArraySortedRecur {
    static boolean asc = true;
    static boolean dsc = true;

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(isArraySorted(arr, 0));
    }

    public static boolean isArraySorted(int[] arr, int n) {
        if (n == arr.length - 1)
            return (asc || dsc);
        if (arr[n] > arr[n + 1])
            asc = false;
        if (arr[n] < arr[n + 1])
            dsc = false;
        System.out.println(n + " asc " + asc + " dsc " + dsc);
        return isArraySorted(arr, n + 1);
    }

}
