package Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

//<T>
public class GenericExample {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        String[] names={"azam","maza"};
        printArr(numbers,"azam");
        printArr(names,new int[]{1,2,3,4});
    }
        public static <T> void printArr(T[] arr,T name){
            for(T element : arr){
                System.out.println(element);
            }

            System.out.println();
        }
//<T>: This part makes the method generic.
// It means that the method can accept an array of any type.
// For example, you can pass an array of Integer, String, Double, or any other type to this method.
}
