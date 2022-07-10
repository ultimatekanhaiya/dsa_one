/*
 *
*/
public class FibonacciSeries{
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacciSeries(n));
        
    }
    static int fibonacciSeries(int n){
        int i = 1;
        int t1 = 0; 
        int t2 = 1;
        int sum = 0;
        while(i <= n){
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        }
        return sum;
    }
}