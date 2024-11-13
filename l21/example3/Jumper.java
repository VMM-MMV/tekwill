package example3;

public class Jumper<T> implements Jump<T> {
    public void jump(T person) {
        System.out.println(person + " has Jumped!!");
    }
}