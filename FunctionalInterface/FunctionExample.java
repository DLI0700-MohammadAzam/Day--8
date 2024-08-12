package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    //    Function <T,R>  : apply(T,t);


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Function<Integer, Integer> squares = num -> num * num;
        list.stream().map(squares).forEach(System.out::println);
        System.out.println(squares.apply(55));
//        Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(squares));
//        System.out.println(collect);

    }
}
