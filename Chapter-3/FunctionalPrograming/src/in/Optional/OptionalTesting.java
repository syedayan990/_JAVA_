package in.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTesting {
    static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 2, 5, 6, 3);
        Optional<Integer> NewSum = numbers.stream()
                .reduce((x, y) -> x + y);
        if (NewSum.isPresent()) {
            System.out.println(NewSum.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
