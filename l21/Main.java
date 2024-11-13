import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList();
        System.out.println();
        myList.add(1);
        myList.add(10);
        myList.add(30);
        myList.printAll();

        MyListString myListString = new MyListString();
        myListString.add("Mi");
        myListString.add("ha");
        myListString.add("i");
        myListString.printAll();
    }
}