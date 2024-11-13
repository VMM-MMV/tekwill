package example4;

import java.util.List;

public class Main {

    public <T> List<T> makeList(T t) {
        return new List<T> (t);
    }
}
