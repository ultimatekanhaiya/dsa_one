/*
 * Reference: YouTube -> GFG -https://practice.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/0/?track=dsa-workshop-1-arrays&batchId=308
 * Time complexity: O(n)
 * Space complexity: O(1) 
 * suppose we have array = [4,0,2,1,3] and we have to Rearrange the given array so that arr[i] becomes arr[arr[i]].
 * arr[arr[0]] = arr[4] = 3
 * arr[arr[1]] = arr[0] = 4
 * arr[arr[2]] = arr[2] = 2
 * arr[arr[3]] = arr[1] = 0
 * arr[arr[4]] = arr[3] = 1
 * now this array [4,0,2,1,3] becomes [3,4,2,0,1]
 * so formula here we used to store both 'new' and 'old' value is Dividend = Divisor * Quotient + Remainder
 * Divisor = size of array
 * Quotient = New number at index i after rearrangement
 * Remainder = Old Number at index i before rearrangement
 * Dividend = The number stored at index i
 * Example: arr[0] = arr[arr[0]]  = arr[4] = 3;
 * but we store it as arr[0] += (arr[arr[0]]%n)*n
 * arr[0] is remainder,arr[arr[0]] is dividend,n is diviser
 * IMPORTANT dividend/divisor = Quotient(new element)   and  dividend%divisor = remainder(old element)
 * arr[i] | arr[arr[i]] | toGetPreviousValue | divisor | new array element(new dividend)
 *    4         3           03%5 = 3           5      => 4+=(3%5)*5  = 19  so 19/5 = 3(new element/Quotient) and 19%5 = 4(remainder/old value)
 *    0         19          19%5 = 4           5      => 0+=(19%5)*5 = 20  so 20/5 = 4(new element/Quotient) and 20%5 = 0(remainder/old value)
 *    2         2           20%5 = 0           5      => 2+=(2%5)*5  = 12  so 12/5 = 2(new element/Quotient) and 12%5 = 2(remainder/old value)
 *    1         20          12%5 = 2           5      => 1+=(20%5)*5 = 1   so 01/5 = 0(new element/Quotient) and 01%5 = 1(remainder/old value)
 *    3         1           01%5 = 1           5      => 3+=(1%5)*5  = 8   so 08/5 = 1(new element/Quotient) and 08%5 = 3(remainder/old value)
 * Conclusion:
 * if u want to remember two numbers on same palce without using extra space just follw this
 * multiply new number with divisor(must be 1 more greater than max value in array) and add old number to it. Ex -> (3(new number)*5(divisor)) + 4(old number) = 19
 * to get back those number just follow this
 * 19/5 = 3;(new number)
 * 19%5 = 4;(old number)
 */

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = { 4, 0, 2, 1, 3 };
        rearrangeArray(arr);
    }

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] += (arr[arr[i]] % n) * n;// we take %n to get old value
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
