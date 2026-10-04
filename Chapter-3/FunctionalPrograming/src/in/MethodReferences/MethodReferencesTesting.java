package in.MethodReferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesTesting {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 2, 5, 6, 3);

        //numbers.stream().filter(num -> num % 2 == 1).forEach(num-> System.out.println(num));
        //                  OOOORRRRRRRRRRRRRRRRRRRRRR
        numbers.stream().filter(num -> num % 2 == 1).forEach(System.out::println); // by method references

//        int newSum2 = numbers.stream()
//                .reduce(0 , (a , b)-> a + b);
//        System.out.printf("Sum is using reducer: %d \n", newSum2);

        //          ORRRRRRRRRRRRR
        int newSum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.printf("Sum is using reducer: %d \n", newSum2);
    }
}
