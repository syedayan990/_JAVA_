package in.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    static void main(String[] args) {
        List list = new ArrayList();
        List <Integer>list2 = new ArrayList<>();   // here we use wrapper object instead of primitive type of variable
        List <String>list3 = new ArrayList<>();   // here we use wrapper object instead of primitive type of variable


        list.add("Ayan");
        list.add("Sheenam");

        list.add(1,"bhai"); // for adding index randomly
        list.remove(1);             // for removing any index from list

        if(list.contains("Ayan")){
            System.out.println("Ayan Exists");
            System.out.println(list.indexOf("Ayan"));
        }else{
            System.out.println("Ayan Not Exists");

        }

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

       Utility.collection(list);
    }
}
