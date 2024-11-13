import java.util.ArrayList;
import java.util.List;

public class MyListString {
    private List<String> list = new ArrayList<>();

    public void add(String val) {
        list.add(val);
    }

    public void remove(String val) {
        list.remove(val);
    }

    public void printAll() {
        for (String val : list) {
            System.out.println(val);
        }
    }
}