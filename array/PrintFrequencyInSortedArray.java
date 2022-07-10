public class PrintFrequencyInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 25, 30, 30, 70 };
        printFre(arr);

    }

    public static void printFreq(int[] arr) {
        int freq = 1;
        int i = 1;
        int n = arr.length;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + freq);
            i++;
            freq = 1;
        }
        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1] + " " + 1);
        }
    }

    public static void printFre(int[] arr) {
        int n = arr.length;
        int fre = 1;
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == num) {
                fre++;
            } else {
                System.out.println(num + ": " + fre);
                fre = 1;
                num = arr[i];
            }

        }
        System.out.println(arr[n - 1] + ": " + fre);
    }

}
