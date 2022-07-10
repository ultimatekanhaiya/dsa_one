public class Test21 {
    public static void main(String[] args) {
        int x = 7;
        int y = 9;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}
