import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.println(i + " " + j);
            }
        }

//        [1,2,3,4] -> [2,4,3,1] -> hashSet
//        [1,2,3,4] -> [1,2,3,4] -> LinkedHashSet
//        [4,1,2,3] -> [1,2,3,4] -> TreeSet
    }

//    1000n:
//        n = 100 -> 1000 * 100
//        n = 1000 -> 1000 * 1000
//        n = 10000 -> 1000 * 10000
//        n = 1000000 -> 1000 * 1000000
//    n^2
//        n=100 -> 100 * 100
//        n=1000-> 1000 * 1000
//        n= 10000 -> 10000*10000
//        n=1000000 -> 1000000 * 100000
}
