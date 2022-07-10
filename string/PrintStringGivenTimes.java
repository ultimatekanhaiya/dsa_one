
public class PrintStringGivenTimes {
    public static void main(String[] args) {
        String s = "a2b3c10";
        printGivenTimes(s);
    }

    static void printGivenTimes(String s){
        String num = "";
        int n = 0;
        char p = s.charAt(0);
        for(int i = 0; i < s.length(); i++){            
            if(Character.isDigit(s.charAt(i))){
                num += s.charAt(i);
            }
            else{                
                if(!num.equals("")){
                    n = Integer.parseInt(num);
                    for(int j = 0; j < n; j++){
                        System.out.print(p);
                    }
                }
                p = s.charAt(i);
                num = "";
            }
            if(i == s.length() - 1){
                n = Integer.parseInt(num);
                for(int j = 0; j < n; j++){
                    System.out.print(p);
                }
            }
        }
    }
    
}
