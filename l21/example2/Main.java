package example2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List names = new ArrayList();
        System.out.println();
        System.out.println();
        names.add("Mihai");
        names.add(1);
        printUpperCaseNames(names);
        
    }
    static void printUpperCaseNames(List list) {
       for (int i = 0;i < list.size(); i++) {
            String name = (String) list.get(i);
            System.out.println(name.toUpperCase());
       }
    }
}
