import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) %2 == 0) {
                System.out.println(numbers.get(i));
            }
        }

        System.out.println();
        
        for (int number : numbers) {
            if (number %2 == 0) {
                System.out.println(number);
            }
        }
        
        System.out.println();

        numbers.stream().filter(x -> x %2 == 0).forEach(x -> System.out.println(x));
    }
}