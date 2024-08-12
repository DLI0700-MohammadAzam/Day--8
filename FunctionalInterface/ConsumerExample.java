package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    //consumer<T> --> doesn't print data only performs an action on the data;
//    Consumer<T> --> accept(T,t);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Azam","AngryBird","Sunny","Akki");
        Consumer<String> st = System.out::println;
        names.forEach(st);
    }

}
