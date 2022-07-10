/**
 ** No Negative Prefix GFG
 * 
 * Given an array A[] of N integers. In each operation, the person can increase
 * the ith element by 1 (i.e. set A[i] = A[i] + 1). The task is to calculate the
 * minimum number of operations required such that there is no prefix in the
 * array A[] whose sum is less than zero. * (i.e. for all i, This condition
 * should be satisfied A[1] + A[2] + .. + A[i] >= 0).
 */

public class Test4 {
    public static void main(String[] args) {
        int[] arr = { 2, -3, 4, -5, -8 };
        System.out.println(minOperations(arr, arr.length));

    }

    public static long minOperations(int A[], int N) {
        // code here
        long count = 0;
        if (A[0] < 0) {
            A[0] = Math.abs(A[0]);
            count += A[0];
        }
        int i = 1;
        while (i < N) {
            System.out.println(A[i - 1] + " ai");
            A[i] = A[i - 1] + A[i];
            if (A[i] < 0) {
                count += Math.abs(A[i]);
                A[i] += Math.abs(A[i]);
                i++;
            } else {
                i++;
            }
        }
        return count;

    }

}
