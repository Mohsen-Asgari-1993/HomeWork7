package tamrin1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Permute {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        printPermutation(word);
    }


    private static Map<Character, Integer> initMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int counter = 0;
            for (int j = 0; j < word.length(); j++) {
                if (ch == word.charAt(j))
                    counter++;
            }
            map.put(ch, counter);
        }
        return map;
    }

    private static void permutation(Map<Character, Integer> map, String perm, int remain) {
        if (remain == 0) {
            System.out.println(perm);
        } else {
            for (char ch : map.keySet()) {
                if (map.get(ch) > 0) {
                    String nextPerm = perm + ch;
                    map.put(ch, map.get(ch) - 1);
                    permutation(map, nextPerm, remain - 1);
                    map.put(ch, map.get(ch) + 1);
                }
            }
        }
    }

    public static void printPermutation(String word) {
        permutation(initMap(word), "", word.length());
    }
}
