public class CustomSetOld {

    private boolean[] array;
    private int size;

    public CustomSetOld(int size) {
        this.size = size;
        this.array = new boolean[size];
    }

    public int hash(String item) {
        return item.size();
    }

    public void add(String item) {
        int arrayPosition = this.hash(item);
        if (array[arrayPosition] == true) {
            return;
        }
        array[arrayPosition] = true;
    }

    public boolean contains(String item) {
        int arrayPosition = this.hash(item);
        return array[arrayPosition] == true;
    }
}