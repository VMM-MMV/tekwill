public class Duck {// implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { return name; }
    public int getWeight() { return weight; }
    public String toString() { return name; }

//    @Override
//    public int compareTo(Duck d) {
//        return name.compareTo(d.name);
//    }

//    [1,4,2,6,7,2,9]
//    1 - 4 = -3 -> [1,4,2,6,7,2,9]
//    4 - 2 = 2  -> [1,2,4,6,7,2,9]
//    4 - 6 = -2 -> [1,2,4,6,7,2,9]
//    6 - 7 = -1 -> [1,2,4,6,7,2,9]
//    7 - 2 = 5  -> [1,2,4,6,2,7,9]

}