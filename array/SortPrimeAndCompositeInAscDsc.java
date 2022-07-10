import java.util.*;

public class SortPrimeAndCompositeInAscDsc {
    public static void main(String[] args) {
        int[] arr = { 12, 2, 7, 5, 4, 3, 6 };
        sortPrimeAndComposite(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void sortPrimeAndComposite(int[] arr) {
        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> com = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                prime.add(arr[i]);
            } else {
                com.add(arr[i]);
            }
        }

        Collections.sort(prime);
        Collections.sort(com, Collections.reverseOrder());

        // *changing array values
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr[i] = prime.get(j);
                j++;
            } else {
                arr[i] = com.get(k);
                k++;
            }
        }

    }

    static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        if (number <= 3)
            return true;
        if (number % 2 == 0 || number % 3 == 0)
            return false;
        for (int i = 5; i * i <= number; i = i + 6)
            if (number % i == 0 || number % (i + 2) == 0)
                return false;

        return true;
    }

}
