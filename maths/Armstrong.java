public class Armstrong{
    public static void main(String[] args) {
        int number = 156;
        armstrong(number);
    }

    static void armstrong(int number) {
        int originalNumber = number;
        int remainder;
        int result = 0;
        while(originalNumber != 0){
            remainder = originalNumber%10;
            result += Math.pow(remainder,3);
            originalNumber /= 10;
        }      
        if(result == number){
            System.out.println(number + " is Armstrong");
        }
        else{
            System.out.println(number + " is not Armstrong");
        }  
    }
}