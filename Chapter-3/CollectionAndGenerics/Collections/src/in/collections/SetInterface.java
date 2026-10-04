package in.collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        System.out.println(set.add("Ayan"));
        System.out.println(set.add("Husain"));
        System.out.println(set.add("Syed"));

        System.out.println();

        Utility.collection(set);
        System.out.println(set.add("Ayan"));
        System.out.println(set.size());

        System.out.println();

        System.out.println(set.contains("Ayan"));
        System.out.println(set.remove("Syed"));
        System.out.println();
        Utility.collection(set);
    }
}
