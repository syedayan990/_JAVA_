package in.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    static void main(String[] args) {
        Map<String , Integer> map = new HashMap<String , Integer>();
        map.put("Ayan" , 100);
        map.put("Sheenam" , 27);
        map.put("Shama" , 30);
        map.put("bintuu" , 89);
        System.out.println(map.size());
        System.out.println(map.get("Ayan"));
        System.out.println(map.containsKey("Sheenam"));
        System.out.println(map.containsKey("farzan"));
        System.out.println(map.remove("bintuu"));
        System.out.println(map.size());

        for(String key : map.keySet()) {
            System.out.printf(" %s : %s\n" , key , map.get(key));
        }

    }
}
