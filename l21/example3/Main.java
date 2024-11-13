package example3;

public class Main {
    public static void main(String[] args) {
        Jumper<Person> jumper = new Jumper<>();
        Person person = new Person("Mihai");
        Jumper<Animal> animalJumper = new Jumper<>();
        Animal animal = new Animal("Moris");
        
        System.out.println("hello");
        jumper.jump(person);
        animalJumper.jump(animal);
    }
}
