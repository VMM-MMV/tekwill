package example5;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Double> doubleList = new ArrayList<Double>();
        List<Float> floatList = new ArrayList<Float>();
        total(list);
    }

    // public static long total(List<? extends Number> list) {
    //     long count = 0;
    //     for (Number number : list)
    //         count += number.longValue();
    //     return count;
    // }
}
