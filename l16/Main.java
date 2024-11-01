import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> arr = Arrays.asList("a", "b", "c");
        System.out.println(new ArrayList(arr));
        System.out.println(new String[0]);
    }
}