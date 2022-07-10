public class Test7 {
    public void prints() {
        System.out.println("print A");
    }

    public static void main(String[] args) {
        Test7 a = new Test8();
        a.prints();

    }
}

class Test8 extends Test7 {
    public void prints() {
        super.prints();
        System.out.println("print B");
    }
}
