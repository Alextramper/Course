package Collections.Set.TreeHash;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeEx {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() > o2.length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Set<String> treeSet = new TreeSet<>(comparator);
        treeSet.add("Kattie");
        treeSet.add("AmyRouy");
        treeSet.add("Body");
        treeSet.add("Garry");
        treeSet.add("Pit");

        System.out.println(treeSet);
    }
}
