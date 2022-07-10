public class Test14 {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 20, 50, 30, 70, 80 };

        int l1 = arr1.length;
        int l2 = arr2.length;

        int[] arr3 = new int[Math.max(l1, l2)];

        int i = 0;
        while (i < l1 && i < l2) {
            arr3[i] = arr1[i] + arr2[i];
            i++;
        }
        while (i < l1) {
            arr3[i] = arr1[i];
            i++;
        }
        while (i < l2) {
            arr3[i] = arr2[i];
            i++;
        }

        for (int x : arr3) {
            System.out.print(x + " ");
        }

    }
}
