public class Main {
    public static void main(String[] args) {
        int[] arr1 = { 10, 10, 20, 7, 11 };
        System.out.println(findSecondLargest(arr1));

        String s = "1234";
        System.out.println(isNumeric(s));

        int[] arr2 = { 1, 3, 5, 7 };
        int[] arr3 = { 2, 2, 3, 4, 6, 8 };
        int[] arr4 = mergeArrays(arr2, arr3);
        for (int x : arr4) {
            System.out.print(x + " ");
        }
    }

    // finding 2nd highest number in array
    static int findSecondLargest(int[] arr) {
        int res = -1;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                res = max;
                max = i;
            } else if (arr[i] < arr[max]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return arr[res];
    }

    // check string isNumeric
    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // merge two sorted array
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int newsize = arr1.length + arr2.length;
        int[] newarr = new int[newsize];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                newarr[k] = arr1[i];
                i++;
                k++;
            } else {
                newarr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            newarr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            newarr[k] = arr2[j];
            j++;
            k++;
        }
        return newarr;
    }

}
