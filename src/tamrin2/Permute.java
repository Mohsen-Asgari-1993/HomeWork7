package tamrin2;

import java.util.HashMap;
import java.util.Map;

public class Permute {

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
}
