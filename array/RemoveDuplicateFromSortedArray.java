/*
 * Reference: GFG
 * Time complexity: O(n)
 * Space complexity: O(1)
 * Expalin: Here we are replacing A[h] with A[i] in such a way that only duplicate value get replaced
 * and returning that much value of h which gives us a non duplicate values.
*/

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 4, 5, 6 };
        int k = removeDuplicate(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicate(int[] arr) {
        int h = 0;// first A = [2,2,3,3,4,5,6]
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[h]) {
                h++;
                arr[h] = arr[i];
            }
        } // last A = [2,3,4,5,6,5,6]
        return h + 1; // the h value is pointing at 4th index = 6, h+1 = 4+1 (5th index)
    }
}
