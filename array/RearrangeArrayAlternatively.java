public class RearrangeArrayAlternatively {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rearrangeArrayAlternatively(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void rearrangeArrayAlternatively(int[] arr) {
        int j = arr.length - 1;
        int k = 0;
        int max = arr[arr.length - 1] + 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[j] % max) * max;
                j--;
            } else {
                arr[i] += (arr[k] % max) * max;
                k++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / max;
        }
    }

}
