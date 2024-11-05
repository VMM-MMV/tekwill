import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        // System.out.println(queue.element()); // throws error
        // System.out.println(queue.peek());    // doesn't throw error

        // queue.offer(3);
        // System.out.println(queue);
        // queue.push(4);
        // System.out.println(queue);

        queue.clear();
        // System.out.println(queue.remove());                      // throws error
        // System.out.println(queue);
        System.out.println(queue.poll());                        // doesn't throw error
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
    }

}