import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        for(int i = 0; i < testcases; i++){
            int size = s.nextInt();
            int k = s.nextInt();
            k = k%size;
            int[] arr = new int[size];
            for(int j = 0; j < size; j++){
                arr[j] = s.nextInt();
            }
            rotate(arr,0,size-k-1);
            rotate(arr,k+1,size-1);
            rotate(arr,0,size-1);
            for(int x: arr){
                System.out.print(x + " ");
            }

        }
    }

    public static void rotate(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    } 
    
}
