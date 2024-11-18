import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Duck duck1 = new Duck("Andrei", 2);
//        Duck duck2 = new Duck("Aihai", 3);
//        System.out.println(duck1.compareTo(duck2));

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
//        Collections.sort(ducks);
//        System.out.println(ducks); // [Puddles, Quack]
//        Comparator<Duck> comparator = (Duck o1, Duck o2) -> o1.getWeight() - o2.getWeight();

//        Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight()—d2.getWeight();
//        Comparator<Duck> byWeight = (Duck d1, Duck d2) -> d1.getWeight() — d2.getWeight();
//        Comparator<Duck> byWeight = (d1, d2) -> { return d1.getWeight() — d2.getWeight(); };
//        Comparator<Duck> byWeight = (Duck d1, Duck d2) -> {return d1.getWeight() — d2.getWeight(); };

        Collections.sort(ducks, comparator);
        System.out.println(ducks); // [Quack, Puddles]
//
//        System.out.println("mihai".compareTo("vieru"));
    }
}
