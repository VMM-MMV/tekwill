import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

public class L17 {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();

        originalMap.put("Ion","IT");
        originalMap.put("Ana","HR");
        originalMap.put("Vasile","Manager");
        originalMap.put("Elena","IT");
        originalMap.put("Petru","SI");

        Queue<Map<String, String>> deque = new ArrayDeque<>();
        for (Map.Entry<String, String> entry : originalMap.entrySet()){
            Map<String,String> tempMap = new HashMap<>();
            tempMap.put(entry.getKey(),entry.getValue());
            deque.offer(tempMap);
        }

        Deque<Map<String, String>> deque2 = originalMap.entrySet().stream()
                                            .map(entry -> Map.of(entry.getKey(), entry.getValue()))
                                            .collect(Collectors.toCollection(ArrayDeque::new));

        System.out.println(deque2);

        // System.out.println("Map original " + originalMap);
        // System.out.println("Map copiat " + copyMap);
    }
}