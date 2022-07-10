public class StairCase {
    static int count;
    static int a = 1, b = 2, c = 3;

    public static void main(String[] args) {
        int n = 4;
        System.out.println(stairCase(n));
    }

    public static int stairCase(int n) {
        if (n == 0)
            return count++;

        if (n < 0)
            return count;

        stairCase(n - a);
        stairCase(n - b);
        stairCase(n - c);
        return count;
    }

}
