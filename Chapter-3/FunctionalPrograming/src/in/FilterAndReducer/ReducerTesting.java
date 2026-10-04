package in.FilterAndReducer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReducerTesting {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.printf("Sum is : %d \n", sum);


        int newSum = numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.printf("Sum is using reducer: %d \n", newSum);

        int newSum2 = numbers.stream()
                .reduce(0 , (a , b)-> a + b);
        System.out.printf("Sum is using reducer: %d \n", newSum2);


        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE , (a , b)-> a > b ? a : b);
        System.out.printf("max is using reducer: %d \n", max);
    }
}
