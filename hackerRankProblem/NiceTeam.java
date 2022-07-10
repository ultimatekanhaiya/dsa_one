/*
 * 
 * 
 * 
 * The team is called nice when a pair of two elements differnce
 */
public class NiceTeam {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1,1};
        int d = 3;
        System.out.println(niceTeam(arr,d));
    }

    static int niceTeam(int[] arr, int d){
        int count = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(Math.abs(arr[i] - arr[j]) == d && arr[j] != -1){
                    count++;
                    arr[j] = -1;
                    arr[i] = -1;
                    break;
                }
            }

        }

        return count;
    }
}
