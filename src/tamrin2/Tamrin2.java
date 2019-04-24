package tamrin2;

import java.util.Random;
import java.util.TreeSet;

public class Tamrin2 {

    private static void initializeTreeSet(TreeSet<Character> firstSet, TreeSet<Character> secondSet) {
        Random random = new Random();
        while (firstSet.size() != 10)
            firstSet.add((char) (random.nextInt(26) + 97));

        while (secondSet.size() != 10)
            secondSet.add((char) (random.nextInt(26) + 97));

    }
}
