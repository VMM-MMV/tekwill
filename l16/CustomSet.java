public class CustomSet<T> {

    private boolean[] array;
    private int size;

    public CustomSet(int size) {
        this.size = size;
        this.array = new boolean[size];
    }

    public int hash(T item) {
        return Math.abs(item.hashCode());
    }

    public void add(T item) {
        int arrayPosition = this.hash(item);
        if (array[arrayPosition]) {
            return;
        }
        array[arrayPosition] = true;
    }

    public boolean contains(T item) {
        int arrayPosition = this.hash(item);
        return array[arrayPosition];
    }
}
