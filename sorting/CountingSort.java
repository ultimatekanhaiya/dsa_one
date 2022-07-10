/*
 * Reference: YouTube -> CodewithHarry = https://www.youtube.com/watch?v=HkvChUv9dDg&t=1249shttps://www.youtube.com/watch?v=HkvChUv9dDg&t=1249s, GFG = https://www.geeksforgeeks.org/counting-sort/
 * https://www.programiz.com/dsa/counting-sort
 * Time complexity: O(n+k)
 * Space complexity: O(n+k)
 * Counting sort: It's not a comparision base sorting algo. It is uesfull only when the max element of array should not have a large difference with array size.
 * It is very usefull for sorting char[] array like String.
*/
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,5,3,2,5};
        countingSort(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    public static int[] countingSort(int[] arr){
        int max = Integer.MIN_VALUE;

        //finding max element in array here max = 5
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        //create auxillary arrray with max+1 size
        int[] aux = new int[max+1];

        //filling auxillary arrray with element frequency using index base referencing
        //like [0,1,2,1,0,3] indexing from 0-5,these are frequencies based on index values.
        for(int i = 0; i < arr.length; i++){
            aux[arr[i]] += 1;
        }

        //modifying original array
        int i = 0;
        int j = 0;
        while(i < aux.length){
            if(aux[i] > 0){
                arr[j] = i;
                aux[i] -= 1;
                j++;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
