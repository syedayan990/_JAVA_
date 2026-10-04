package in.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(-23);

        Utility.collection(list);

        Collections.sort(list);
        Utility.collection(list);

        Collections.reverse(list);
        Utility.collection(list);
    }
}
