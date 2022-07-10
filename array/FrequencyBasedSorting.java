
/*
 * Reference1 : https://www.youtube.com/watch?v=PjKjbpI2Z3s
 * Reference2 : https://www.youtube.com/watch?v=0xrhqxTOphI&t=510s
 * Reference3 : https://www.youtube.com/watch?v=IAUfxFDnPOc
 * Reference4 : https://stackoverflow.com/questions/30995101/inline-comparator-vs-custom-comparator-in-java
 * 
 */
import java.util.*;

public class FrequencyBasedSorting {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 5, 3, 5, 6, 6, 6, 6, 10, 4 };

        List<Integer> l = new ArrayList<>();
        for (int x : arr) {
            l.addAll(Arrays.asList(x));
        }
        System.out.println(frequencyBasedSorting(l));
    }

    static List<Integer> frequencyBasedSorting(List<Integer> l) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < l.size(); i++) {
            map.put(l.get(i), map.getOrDefault(l.get(i), 0) + 1);
        }
        Collections.sort(l, (n1, n2) -> {
            int freq1 = map.get(n1);
            int freq2 = map.get(n2);
            if (freq1 != freq2) {
                return freq2 - freq1;
            }
            return n1 - n2;

        });
        return l;
    }
}
