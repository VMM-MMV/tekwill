package hw;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Mihai", 21));
        persons.add(new Person("Andrei", 40));
        persons.add(new Person("Vasile", 87));
        persons.add(new Person("Ion", 79));

        for (Person person : persons) {
            if (person.getAge() <= 60) continue;
            System.out.println(person);
        }
    }
}
