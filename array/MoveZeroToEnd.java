public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 0, 10, 20, 0, 30 };
        moveZeroToEnd(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    public static void moveZeroToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}
