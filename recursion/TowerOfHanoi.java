public class TowerOfHanoi {
    public static void main(String[] args) {
        moveDiscs(3, 'A', 'B', 'C');
    }

    public static void moveDiscs(int n, char a, char b, char c) {
        if (n == 0) {
            return;
        }
        moveDiscs(n - 1, a, c, b);
        System.out.println("move disc from " + a + " to " + b);
        moveDiscs(n - 1, c, b, a);
    }

}
