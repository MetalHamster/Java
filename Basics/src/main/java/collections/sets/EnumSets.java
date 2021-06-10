package collections.sets;

import java.util.Set;

public class EnumSets {
    /*
    Much faster than HashSet
     */

    public static void main(String[] args) {
        Set<Level> set1 = java.util.EnumSet.of(Level.EASY,Level.MEDIUM,Level.HARD);

        System.out.println(set1);
    }
}
