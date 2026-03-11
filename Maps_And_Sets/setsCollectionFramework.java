package Maps_And_Sets;

import java.util.HashSet;

public class setsCollectionFramework {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(21);
        set.add(98);
        set.add(54);
        set.add(76);
        System.out.println(set.size());
        System.out.println(set.contains(98));
        set.remove(21);
        System.out.println(set);

    }
}
