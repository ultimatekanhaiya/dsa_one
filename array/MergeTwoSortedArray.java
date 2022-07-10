public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,2,3,4,6,8};
        int[] arr3 = mergeArrays(arr1,arr2);
        for(int x : arr3){
            System.out.print(x + " ");
        } 
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int newsize = arr1.length + arr2.length;
        int[] newarr = new int[newsize];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                newarr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                newarr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < arr1.length){
            newarr[k] = arr1[i];
            i++;
            k++; 
        }

        while(j < arr2.length){
            newarr[k] = arr2[j];
            j++;
            k++; 
        }  
        return newarr;
    }
    
}
