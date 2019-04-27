package tamrin2;

import java.util.Random;
import java.util.TreeSet;

public class Tamrin2 {

    public static void main(String[] args) {
        TreeSet<Character> firstSet = new TreeSet<>();
        TreeSet<Character> secondSet = new TreeSet<>();
        initializeTreeSet(firstSet, secondSet);
        System.out.println("First Tree Set: "+firstSet);
        System.out.println("Second Tree Set: "+secondSet);
        gatheringTreeSets(firstSet, secondSet);
        commonElemntsInTreeSets(firstSet, secondSet);
    }

    private static void initializeTreeSet(TreeSet<Character> firstSet, TreeSet<Character> secondSet) {
        Random random = new Random();
        while (firstSet.size() != 10)
            firstSet.add((char) (random.nextInt(26) + 97));

        while (secondSet.size() != 10)
            secondSet.add((char) (random.nextInt(26) + 97));

    }

    private static void gatheringTreeSets(TreeSet<Character> firstSet, TreeSet<Character> secondSet) {
        TreeSet<Character> third = new TreeSet<>();
        third.addAll(firstSet);
        third.addAll(secondSet);
        System.out.println("First Tree Set + Second Tree Set : " + third);
    }

    private static void commonElemntsInTreeSets(TreeSet<Character> firstSet, TreeSet<Character> secondSet) {
        TreeSet<Character> third = new TreeSet<>();
        for (Character set : firstSet) {
            if (secondSet.contains(set))
                third.add(set);
        }
        System.out.println("Common Elements in First and Second Tree Set : " + third);
    }
}
