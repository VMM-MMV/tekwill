// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Deque;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Map;
// import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // List<String> answers = new ArrayList<>(); //line 1

        // answers.add("Yes"); //line 2

        // answers.add("No");

        // answers.add("Maybe");

        // answers.add("Sure");

        // answers.add(0, "No"); //line 3

        // answers.remove("No"); //line 4

        // System.out.println(answers.get(2)); //line 5

        // System.out.println(answers.contains("Maybe")); //line 6

        // for (String answer : answers) //line 7

        //     System.out.println(answer);

        // Set<String>names = new HashSet<>(); //line 1

        // names.add("Mike"); //line 2

        // names.add("John"); //line 3
        // names.add("John"); //line 3
        // names.add("John"); //line 3
        // names.add("John"); //line 3
        // names.add("John"); //line 3
        // names.add("John"); //line 3

        // names.addAll(Arrays.asList("Jena", "John")); //line 4

        // names.remove("Jena"); //line 5

        // System.out.println(names); //line 6

        // Map<String, Integer> visitors = new HashMap<>();

        // String visitor = "viem2377@gmail.com";
        
        // System.out.println(visitors.get(visitor));

        // visitors.put(visitor, 1);
        // visitors.put(visitor, 1);
        // visitors.put(visitor, 1);
        // visitors.put(visitor, 1);

        // calculateNewVisitor(visitors, visitor);

        // System.out.println(visitors.get(visitor));
        
        // calculateNewVisitor(visitors, visitor);
        
        // System.out.println(visitors.get(visitor));


        // Map<String, String>numbersToNames = new HashMap<>(); //line 1

        // numbersToNames.put("Mike Anderson", "+37378549876"); // line 2

        // numbersToNames.put("John Thompson", "+37369879564");

        // numbersToNames.put("Bob Clay", "+37368545624");


        // System.out.println(numbersToNames.get("Bob Clay")); //line 3


        // for (String name : numbersToNames.keySet()) { //line 4

        //     System.out.println(name);

        // }


        // for (String number : numbersToNames.values()) { //line 5

        //     System.out.println(number);

        // }


        // for (Map.Entry<String, String>entry : numbersToNames.entrySet()) { //line 6

        //         System.out.println(entry.getKey() + " : " + entry.getValue());

        //     }

        // }

        Deque<Character> letters = new ArrayDeque<>(Arrays.asList('A', 'B', 'C')); //line 1

        letters.push('D'); //line 2

        System.out.println(letters);
        
        letters.offer('E'); //line 3
        
        System.out.println(letters);
        
        System.out.println(letters.remove()); //line 4
        
        System.out.println(letters);
        System.out.println(letters.pop()); //line 5
        
        System.out.println(letters);
        
        letters.add('F'); //line 6
        System.out.println(letters);
        
        System.out.println(letters.peek()); //line 7
        System.out.println(letters);
        
        System.out.println(letters.toString()); //line 8

        Map<String, Double> map = new HashMap<>();

        map.add("x", new Double(123.4));

        System.out.println(map);


    }
    // public static void calculateNewVisitor(Map<String, Integer> visitors, String visitor) {
    //     if (!visitors.containsKey(visitor)) {
    //         visitors.put(visitor, 1);
    //     } else {
    //         int visitiedAmount = visitors.get(visitor);
    //         visitors.put(visitor, visitiedAmount + 1);
    //     }
    // }
}