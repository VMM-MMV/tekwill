import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private List<T> list = new ArrayList<>();

    public void add(T val) {
        list.add(val);
    }

    public void remove(T val) {
        list.remove(val);
    }

    public void printAll() {
        for (T val : list) {
            System.out.println(val);
        }
    }
}