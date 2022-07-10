
public class Test13 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        System.out.println(sumArray(array));
    }

    static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
