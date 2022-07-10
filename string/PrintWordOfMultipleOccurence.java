
/**
 * Link to learn how to itrate over HashMap ->https://www.geeksforgeeks.org/traverse-through-a-hashmap-in-java/
 */
// very important
import java.util.*;
import java.util.Map.Entry;

public class PrintWordOfMultipleOccurence {
    public static void main(String[] args) {
        String s = "hello this is me this is You bye you";
        printWords(s);
    }

    public static void printWords(String s) {
        s = s.toUpperCase();
        HashMap<String, Integer> map = new HashMap<>();
        String[] sarr = s.split(" ");
        for (int i = 0; i < sarr.length; i++) {
            if (map.containsKey(sarr[i])) {
                map.put(sarr[i], map.get(sarr[i]) + 1);
            } else {
                map.put(sarr[i], 1);
            }
        }
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.print(entry.getKey() + " ");
            }
        }

    }

}
