package in.FilterAndReducer;

import java.util.List;
import java.util.function.Consumer;

public class FilterTesting {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "banana", "grape", "aaduu");
        System.out.println(fruits.size());

        System.out.println();
        System.out.println("Printing fruits normaly");
        for (String fruit : fruits) {  // with normal method
            System.out.println(fruit);
        }
        System.out.println();
        System.out.println("Printing fruits using stream");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });
        System.out.println();
        System.out.println("Printing fruits using lambda");
        fruits.stream().forEach(fruit -> System.out.println(fruit)); // .forEach is the terminal operation without this code not get run


        System.out.println();
        System.out.println("Printing fruits using lambda and filter");
        fruits.stream()
                .filter(fruit -> fruit.toLowerCase().startsWith("a"))
                .forEach(fruit -> System.out.println(fruit));  // .forEach is the terminal operation without this code not get run
    }
}
