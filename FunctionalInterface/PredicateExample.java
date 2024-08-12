package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Predicate<Integer> even = num -> num % 2 == 0;// Predicate is a functional interface which contains a boolean value
        List<Integer> even_numbers = numbers.stream().filter(even).collect(Collectors.toList());
        System.out.println(even_numbers);
    }
}
