import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> innitialList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        // System.out.println(filterByEven(innitialList));
        // System.out.println(filter(innitialList, x -> x %2 == 0));
        // // System.out.println(filter(innitialList, x -> x %2 != 0));

        // innitialList.stream().filter(x -> x %2 == 0).filter(x -> x > 5).forEach(x -> System.out.println(x));
        
        // List<Integer> newList =  filter(innitialList, x -> x %2 == 0);
        // newList = filter(newList, x -> x > 5);
        // System.out.println(newList);
        System.out.println(innitialList.stream()
                .filter(x -> x %2 == 0)
                .filter(x -> x > 5)
                .peek(x -> System.out.println(x))
                .min((a,b) -> a - b));

        // System.out.println();

        // System.out.println(amountOfElements);

        System.out.println();
        innitialList.stream().map(x -> x * x).forEach(x -> System.out.println(x));
    }

    // private static List<Integer> filterByEven(List<Integer> numbers) {
    //     List<Integer> filteredList = new ArrayList<>();
    //     for (int number : numbers) {
    //         if (number %2 == 0) {
    //             filteredList.add(number);
    //         }
    //     }
    //     return filteredList;
    // }

    // private static List<Integer> filter(List<Integer> numbers, Filterable<Integer> validator) {
    //     List<Integer> filteredList = new ArrayList<>();
    //     for (int number : numbers) {
    //         if (validator.valid(number)) {
    //             filteredList.add(number);
    //         }
    //     }
    //     return filteredList;
    // }
}