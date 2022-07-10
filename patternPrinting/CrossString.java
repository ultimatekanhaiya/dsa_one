public class CrossString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";//string is of odd length always
        crossString(s);
    }

    static void crossString(String s){
        int n = s.length();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == i || j == n-i-1){                
                    System.out.print(s.charAt(i));
                }
                else{
                    System.out.print("  ");
                }                
            }
            System.out.println();
        }    
    }    
}
