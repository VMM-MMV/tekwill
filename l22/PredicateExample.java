import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
//        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        Function<String, Boolean> p3 = x -> x.isEmpty();
//        System.out.println(p1.test("a"));
        System.out.println(p2.test(""));
        System.out.println(p3.apply(""));

//        p2.test("") => "" -> x.isEmpty(); => "".isEmpty();

//        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
//        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));

        BiPredicate<String, String> b3 = (string, prefix) -> string.equals(prefix);
        System.out.println(b3.test("mihai", "mihai"));

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9));
        integerList.stream().filter(x -> x %2 == 0).forEach(System.out::println);
                            myFilter(integerList, x -> x % 2 == 0).forEach(System.out::println);
    }

    public static <T> List<T> myFilter(List<T> myList, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T element : myList) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
}
