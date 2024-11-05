package hw;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object item) {
        if (this == item) {
            return true;
        }
        if (!(item instanceof Person)) {
            return false;
        }
        Person other = (Person) item;
        return Objects.equals(name, other.name) && age == other.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    
    public String toString() {
        return "Person{name: " + name + ", age: " + age + "}"; 
    } 

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}
