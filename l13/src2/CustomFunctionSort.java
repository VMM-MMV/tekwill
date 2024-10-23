package src2;

public class CustomFunctionSort {
    @FunctionalInterface
    interface IntFunction<T> {
        int apply(T value);
    }
    
    @FunctionalInterface
    interface IntComparator {
        int compare(int a, int b);
    }
    
    
    public static void sort(Student[] arr, IntFunction<Student> keyExtractor, IntComparator comparator) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Extract values using our custom function
                int value1 = keyExtractor.apply(arr[j]);
                int value2 = keyExtractor.apply(arr[j + 1]);
                
                // Compare using our custom comparator
                if (comparator.compare(value1, value2) > 0) {
                    // Swap elements
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(101, "John", 85),
            new Student(102, "Alice", 92),
            new Student(103, "Bob", 78),
            new Student(104, "Carol", 95)
        };
        
        IntFunction<Student> getIdFunction = new IntFunction<Student>() {
            @Override
            public int apply(Student student) {
                return student.getId();
            }
        };
        
        System.out.println("Sorting by ID (ascending):");
        IntComparator descendingOrder = (a, b) -> b - a;
        sort(students, getIdFunction, descendingOrder);
        printArray(students);
        
        IntComparator ascendingOrder = (a, b) -> a - b;
        IntFunction<Student> getScoreFunction = student -> student.getScore();
        System.out.println("\nSorting by score (ascending):");
        sort(students, getScoreFunction, ascendingOrder);
        printArray(students);
        
        System.out.println("\nSorting by score (descending):");
        sort(students, getScoreFunction, descendingOrder);
        printArray(students);
        
        System.out.println("\nSorting by even/odd ID:");
        IntComparator evenOddComparator = (a, b) -> {
            boolean aEven = a % 2 == 0;
            boolean bEven = b % 2 == 0;
            if (aEven && !bEven) return -1;
            if (!aEven && bEven) return 1;
            return a - b;
        };
        sort(students, Student::getId, evenOddComparator);
        printArray(students);
    }
    
    private static void printArray(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}