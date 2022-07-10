import java.util.*;
public class Test1{
    public static void main(String[] args){
        String s = "1234q";
        String[] sarr = s.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < sarr.length; i++){
            if(map.containsKey(sarr[i])){
                map.put(sarr[i],map.get(sarr[i])+1);
            }
            else{
                map.put(sarr[i], 1);
            }
        }
        for(int i = 0; i < sarr.length; i++){
            if(map.get(sarr[i]) > 1){
                System.out.println(sarr[i]);
            }
        }
    }

    public static int[] mergeTwoArrays(int[] ar1, int[] ar2){
        int size = ar1.length + ar2.length;
        int[] arr = new int[size];
        for(int i = 0; i < ar1.length; i++)
        {
            arr[i] = ar1[i];
        }
        for(int i = ar1.length; i < ar2.length; i++)
        {
            arr[i] = ar2[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
