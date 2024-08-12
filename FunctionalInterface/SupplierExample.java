package FunctionalInterface;

import java.util.function.Supplier;

public class SupplierExample {
    //
    public static void main(String[] args) {

        Supplier<String> random = () -> String.valueOf(Math.random());
        System.out.println(random.get());
    }
}
