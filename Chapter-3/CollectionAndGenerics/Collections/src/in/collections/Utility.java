package in.collections;

import java.util.Collection;

public class Utility {
    public static void collection(Collection collection) {
        System.out.print("collection is: ");
        for(Object ayan : collection) {
            System.out.print(" " + ayan);
        }
        System.out.println();
    }
}
