package example5;

import java.util.ArrayList;
import java.util.List;

public class Main {     
     
    public static void main (String[]args){
        System.out.println("hello");
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords); // Nu se compilează

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(20);
        printList(numbers);

        // List<Integer> numbers2 = new ArrayList<>();
        // numbers2.add(new Integer(42));
        // List<Object> objects = numbers2; // Nu se va compila
        // objects.add("forty two");
        // System.out.println(numbers.get(1));
    }

    public static <T> void printList2(List<T> list) {
        for (Object x : list) System.out.println(x);
    }

    public static void printList(List<?> list) {
        for (Object x : list) System.out.println(x);
    }
}
