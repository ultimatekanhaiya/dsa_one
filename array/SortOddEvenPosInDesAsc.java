public class SortOddEvenPosInDesAsc {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        oddEvenElementInDecAsc(arr);
        for(int x: arr){
            System.out.print(x + " ");
        }
    }

    static int[] oddEvenElementInDecAsc(int[] arr){
        for(int i = 0; i < arr.length; i+=2){
            for(int j = i+2; j < arr.length; j+=2){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 1; i < arr.length; i+=2){
            for(int j = i+2; j < arr.length; j+=2){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    
}
